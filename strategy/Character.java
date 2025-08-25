package strategy;

public abstract class Character {
    protected String name;

   private WeaponBehavior weaponBehavior;

    public Character(String name1) {
        this.name = name1;
        this.weaponBehavior = new WeaponNone();
    }
    
    public void setWeaponBehavior(WeaponBehavior weaponBehavior){

       this.weaponBehavior = weaponBehavior;
    }

    public void attack(){
        weaponBehavior.attack();
    }

    public String toString(Character charecter){
        return charecter.toString();
    }

}