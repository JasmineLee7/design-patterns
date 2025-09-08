/**
 * Vanilla is another scoop flavor.  
 * Extends ScoopDecorator and gives the scoop a white color. 
 */
public class Vanilla extends ScoopDecorator {
    /**
     * Makes a Vanilla scoop.
     * @param iceCream the ice cream we’re adding scoops to
     * @param numScoops how many vanilla scoops to add
     */
    public Vanilla(IceCream iceCream, int numScoops) { 
        super(iceCream, numScoops); 
    }

     /**
     * Sets the color for this flavor (white).
     * @return ANSI code for white
     */
    protected String flavorColor() { 
        return ANSI_WHITE; 
    }
}