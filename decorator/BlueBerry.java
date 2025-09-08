// Jasmine Lee
/**
 * BlueBerry is one of the scoop flavors.  
 * It extends ScoopDecorator and just gives the scoop a blue color. 
 */
public class BlueBerry extends ScoopDecorator {
    /**
     * Makes a BlueBerry scoop.
     * @param iceCream the ice cream we’re adding scoops to
     * @param numScoops how many blueberry scoops to add
     */
    public BlueBerry(IceCream iceCream, int numScoops) {
         super(iceCream, numScoops);
    }

    /**
     * Sets the color for this flavor (blue).
     * @return ANSI code for blue
     */
    protected String getColour() {
         return ANSI_BLUE;
    }
}