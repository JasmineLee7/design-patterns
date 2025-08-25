package strategy;
// Jasmine Lee - Aug 2025

public class WeaponKnife implements WeaponBehavior {
    
    protected String knife = "/--";
    protected int screenWidth = 125;

    public void attack() {
        final int screenWidth = 125; // works on my screen!

        for (int i = 0; i <= screenWidth; i++) {
            Resources.clear(); // clears behind knife

            for (int j = 0; j < i; j++) { // moves the knife
                System.out.print(" ");
            }
            System.out.println(knife);
            Resources.sleep(30); // slows down knife
    }

    }
}
