import java.util.Scanner;


public class IceCreamShopDriver {
   private Scanner reader;
   private int numScoopsLeft;
   private static final int MAX_SCOOPS = 6;
   private static final String BLUEBERRY = "Blueberry";
   private static final String VANILLA = "Vanilla";
   private static final String STRAWBERRY = "Strawberry";


   public IceCreamShopDriver() {
       reader = new Scanner(System.in);
       numScoopsLeft = MAX_SCOOPS;
   }


   public void order() {
       IceCream iceCream = new Cone();


       System.out.println("You can have a maximum of " + MAX_SCOOPS + " scoops.");
       int blue  = getNumScoops(BLUEBERRY);
       int straw = getNumScoops(STRAWBERRY);
       int van   = getNumScoops(VANILLA);
       int total = blue + straw + van;
       ScoopDecorator.setUp(total);
       iceCream = new BlueBerry(iceCream, blue);
       iceCream = new Strawberry(iceCream, straw);
       iceCream = new Vanilla(iceCream, van);     
       System.out.println("\nHere's your ice cream cone.\n");
       System.out.println(iceCream);
   }

   public IceCream addScoops(IceCream iceCream, String flavor){
       int num = 0;

       while(true) {
           System.out.print("How many scoops of " + flavor + ": ");
           num = Integer.parseInt(reader.nextLine());

           if(num < 0 || num > numScoopsLeft){
               System.out.println("Sorry, you need to pick between 0 and " + numScoopsLeft);
               continue;
           }
           numScoopsLeft -= num;
           break;
       }
      
       if(num > 0) {
           if(flavor.equals(BLUEBERRY)){
               return new BlueBerry(iceCream, num);
           } else if(flavor.equals(STRAWBERRY)){
               return new Strawberry(iceCream, num);
           } else if(flavor.equals(VANILLA)){
               return new Vanilla(iceCream, num);
           }
          
       }
       return iceCream;
   }
  
   private int getNumScoops(String flavor) {
       while (true) {
           System.out.print("How many scoops of " + flavor + ": ");
           String s = reader.nextLine().trim();
           try {
               int n = Integer.parseInt(s);
               if (n < 0 || n > numScoopsLeft) {
                   System.out.println("Sorry, you need to pick between 0 and " + numScoopsLeft);
               } else {
                   numScoopsLeft -= n;
                   return n;
               }
           } catch (NumberFormatException e) {
               System.out.println("Please enter a whole number.");
           }
       }
   }

   public static void main(String[] args) {
       (new IceCreamShopDriver()).order();
   }
}
