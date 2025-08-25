package strategy;
// Jasmine Lee - Aug 2025

public class King extends Character {
    
    public King(String name) { 
        super(name); 
    }

    public String toString(){ // displays character information
        return "-^-\n" + "King" + ":"+name;
    }
}
