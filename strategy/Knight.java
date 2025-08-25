package strategy;
// Jasmine Lee - Aug 2025

public class Knight extends Character {
    
    public Knight(String name) { 
        super(name); 
    }

    public String toString(){  // displays character information
        return "{^}\n" + "Knight" + ":"+name;
    }



}
