package strategy;
// Jasmine Lee - Aug 2025

public abstract class Character {
    protected String name;

   private WeaponBehavior weaponBehavior;

    public Character(String name1) { // to call the character traits
        this.name = name1;
        this.weaponBehavior = new WeaponNone();
    }
    
    public void setWeaponBehavior(WeaponBehavior weaponBehavior){
 
       this.weaponBehavior = weaponBehavior;
    }

    public void attack(){ // basic attack method
        weaponBehavior.attack();
    }

    public String toString(Character charecter){ // Title, Name, and crown display
        return charecter.toString();
    }

}