package strategy;

public class King extends Character {
    
    public King(String name) { 
        super(name); 
    }

    public String toString(){
        return "crown\n" + "King" + ":"+name;
    }

    public void display(){

        System.out.println("king hat");
    }

}
