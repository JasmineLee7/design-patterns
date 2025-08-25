package strategy;

public class WeaponBow implements WeaponBehavior {
    
    protected String bow = ")";
    protected String arrow = "-->";


    public void attack() {
        System.out.println(")");
        System.out.print("-->");
    }

}
