package strategy;

public class WeaponKnife implements WeaponBehavior {
    
    protected String knife = "/--";
    protected int screenWidth = 125;

    public void attack() {
    System.out.println("/----");

    for(int i=0; i<=screenWidth; i++){
        Resources.clear();

        for(int j=0; j<i;j++){
            System.out.println("");
        }
        System.out.print(knife);
        Resources.sleep(50);
    }
    
    }
}
