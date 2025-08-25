package strategy;

public class WeaponBow implements WeaponBehavior {
    
    protected String bow = ")";
    protected String arrow = "-->";


    public void attack() {
        final int screenWidth = 125; 

        for (int i = 0; i <= screenWidth; i++) {
            Resources.clear();
            System.out.print(bow); // bow behind the arrow

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(arrow); 
            Resources.sleep(30);
    }
    }
}
