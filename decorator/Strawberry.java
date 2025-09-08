/**
 * Strawberry is a scoop flavor.  
 * Extends ScoopDecorator and gives the scoop a red color. 
 */
public class Strawberry extends ScoopDecorator {
    /**
     * Makes a Strawberry scoop.
     * @param iceCream the ice cream we’re adding scoops to
     * @param numScoops how many strawberry scoops to add
     */
    public Strawberry(IceCream iceCream, int numScoops) { 
        super(iceCream, numScoops); 
    }

    /**
     * Sets the color for this flavor (red).
     * @return ANSI code for red
     */
    protected String getColour() { 
        return ANSI_RED; 
    }
}
