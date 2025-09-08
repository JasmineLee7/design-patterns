import java.util.ArrayList;

/**
 * IceCream is the abstract base class for everything (cones, scoops, etc).  
 * It mainly holds the ASCII art lines and keeps track of scoop count.  
 * The colors are also defined here so flavors can use them. 
 */
public abstract class IceCream {
    protected final ArrayList<String> asciiArt = new ArrayList<>();
    protected int numScoops;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE  = "\u001B[34m";
    public static final String ANSI_RED   = "\u001B[31m";
    public static final String ANSI_WHITE = "\u001B[37m";

    /**
     * Turns the ASCII art list into one string so it prints nicely.
     * @return the full ice cream drawing
     */
    public String toString() {
        return String.join("\n", asciiArt);
    }

    /**
     * Gets the number of scoops currently on this ice cream.
     * @return the number of scoops
     */
    public int getNumScoops() { 
        return numScoops; 
    }
}