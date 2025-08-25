package strategy;

public class Knight extends Character {
    
    public Knight(String name) { 
        super(name); 
    }

    public String toString(){
        return "little cown\n" + "Knight" + ":"+name;
    }

    public void display(){
        System.out.println("Kinght hat");
    }

}
