package strategy;

public class Troll extends Character{
    
    public Troll(String name) { 
        super(name); 
    }

    public String toString(){
        return "(^)\n" + "Troll" + ":"+name;
    }

    public void display(){
        System.out.println("troll hat");
    }
}
