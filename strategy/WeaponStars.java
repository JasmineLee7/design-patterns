package strategy;

public class WeaponStars implements WeaponBehavior {
    

    protected String stars = "**";

    public void attack() {
        System.out.println("**************");
    }

}
