package strategy;
// Jasmine Lee - Aug 2025

public class Troll extends Character{
    
    public Troll(String name) { 
        super(name); 
    }

    public String toString(){  // displays character information
        return "(^)\n" + "Troll" + ":"+name;
    }

}
