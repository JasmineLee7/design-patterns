// Jasmine Lee
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
   private static int index = -1;

    /**
    * Sets up where scoops will be placed before building them. 
    * @param totalScoops total number of scoops in the whole ice cream
    */
   public static void setUp(int totalScoops) {
       index = Math.max(0, totalScoops - 1);
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
           maxWidth(iceCream.asciiArt),
           width(index)
       );

       ArrayList<String> mine = new ArrayList<>();

       for (int i = 0; i < this.numFlavorScoops; i++) {
           int index1 = index - (this.numFlavorScoops - 1 - i);
           int dashes = Math.max(0, index1) * 2;
           String scoop = "(" + repeat('-', dashes) + ")";
           String colored = getColour() + scoop + ANSI_RESET;
           mine.add(center(colored, frameWidth));
       }
       index -= this.numFlavorScoops;

       this.asciiArt.addAll(mine);
       this.asciiArt.addAll(iceCream.asciiArt);
   }

   /**
    * Each scoop flavor sets its own color. 
    * @return ANSI color code for the scoop
    */
   protected abstract String getColour();

   // makes a string of the same character repeated
   private static String repeat(char ch, int n) {
       StringBuilder sb = new StringBuilder(Math.max(0, n));
       for (int i = 0; i < n; i++) sb.append(ch);
       return sb.toString();
   }

   // gets the length of a string without ANSI codes
   private static int length(String s) {
      return s == null ? 0 : ANSI_RE.matcher(s).replaceAll("").length();
   }

   // finds the max width of the ASCII art
   private static int maxWidth(List<String> art) {
       int m = 0;
       for (String s : art) m = Math.max(m, length(s));
       return m;
   }

   // figures out how wide a scoop will look at a given index
   private static int width(int index) {
       if (index < 0) return 0;
       return length("(" + repeat('-', index * 2) + ")");
   }

    // centers a scoop so everything lines up
   private static String center(String string, int width) {
       int pad = Math.max(0, (width - length(string)) / 2);
       StringBuilder stringBuilder = new StringBuilder(pad + string.length());
       for (int i = 0; i < pad; i++) stringBuilder.append(' ');
       stringBuilder.append(string);
       return stringBuilder.toString();
   }
}
