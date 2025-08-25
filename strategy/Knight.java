package strategy;

public class Knight extends Character {
    
    public Knight(String name) { 
        super(name); 
    }

    public String toString(){
        return "{^}\n" + "Knight" + ":"+name;
    }

    public void display(){
        System.out.println("Kinght hat");
    }

}
