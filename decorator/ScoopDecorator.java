import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
/**
 * ScoopDecorator is the abstract class for all scoop flavors.  
 * It stacks scoops on top of an IceCream (like Cone) and adds color.  
 * Handles the ASCII art so the scoops line up nicely. 
 */
public abstract class ScoopDecorator extends IceCream {

    protected IceCream iceCream;       
    protected int numFlavorScoops;  
    private static final Pattern ANSI_RE = Pattern.compile("\u001B\\[[;\\d]*m");
    private static int nextIndexHigh = -1;

     /**
     * Sets up where scoops will be placed before building them.  
     * @param totalScoops total number of scoops in the whole ice cream
     */
    public static void initAllocator(int totalScoops) {
        nextIndexHigh = Math.max(0, totalScoops - 1);
    }

    /**
     * Builds a scoop (or multiple) on top of an ice cream.  
     * Figures out spacing, colors the scoop, and centers it.
     * @param iceCream the ice cream we’re decorating
     * @param numScoops how many scoops of this flavor to add
     */
    public ScoopDecorator(IceCream iceCream, int numScoops) {
        this.iceCream = iceCream;
        this.numFlavorScoops = Math.max(0, numScoops);
        this.numScoops = iceCream.numScoops + this.numFlavorScoops;

        int frameWidth = Math.max(
            maxVisibleWidth(iceCream.asciiArt),
            scoopVisibleLen(nextIndexHigh)
        );

        ArrayList<String> mine = new ArrayList<>();

        for (int i = 0; i < this.numFlavorScoops; i++) {
            int idx = nextIndexHigh - (this.numFlavorScoops - 1 - i);
            int dashes = Math.max(0, idx) * 2;
            String scoop = "(" + repeat('-', dashes) + ")";
            String colored = flavorColor() + scoop + ANSI_RESET;
            mine.add(center(colored, frameWidth));
        }
        nextIndexHigh -= this.numFlavorScoops;

        this.asciiArt.addAll(mine);
        this.asciiArt.addAll(iceCream.asciiArt);
    }

    /**
     * Each scoop flavor sets its own color.  
     * @return ANSI color code for the scoop
     */
    protected abstract String flavorColor();

    // makes a string of the same character repeated
    private static String repeat(char ch, int n) {
        StringBuilder sb = new StringBuilder(Math.max(0, n));
        for (int i = 0; i < n; i++) sb.append(ch);
        return sb.toString();
    }

    // gets the length of a string without ANSI codes
    private static int visibleLen(String s) {
        return s == null ? 0 : ANSI_RE.matcher(s).replaceAll("").length();
    }

    // finds the max width of the ASCII art
    private static int maxVisibleWidth(List<String> art) {
        int m = 0;
        for (String s : art) m = Math.max(m, visibleLen(s));
        return m;
    }

    // figures out how wide a scoop will look at a given index
    private static int scoopVisibleLen(int idx) {
        if (idx < 0) return 0;
        return visibleLen("(" + repeat('-', idx * 2) + ")");
    }

     // centers a scoop so everything lines up
    private static String center(String string, int width) {
        int pad = Math.max(0, (width - visibleLen(string)) / 2);
        StringBuilder stringBuilder = new StringBuilder(pad + string.length());
        for (int i = 0; i < pad; i++) stringBuilder.append(' ');
        stringBuilder.append(string);
        return stringBuilder.toString();
    }
}