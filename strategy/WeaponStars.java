package strategy;

public class WeaponStars implements WeaponBehavior {
    

    protected String stars = "****"; // I like mine moving without the trail behind!

    public void attack() {
        final int screenWidth = 125; // good enough for my screen

        for (int i = 0; i <= screenWidth; i++) {
           Resources.clear(); // clears behind it
            
            for (int j = 0; j < i; j++) { // moves the stars
                System.out.print(" ");
            }
            System.out.println(stars);
            Resources.sleep(30); // delays the stars
    }
    }
}
