package state;

public class InTransitState extends State{
    private int days = 5;

    public InTransitState(Package pkg){
        super(pkg);
    }

    public String getStatus(){
        return ("The "+pkg.getName()+" VERB in transit");
    }

    public String getETA(){
        int delayChance = random.nextInt(10);
        int delayLength = random.nextInt(7);
        
        // 30% chance
        if(delayChance<=2){
            days = days+delayLength;
            String delayMessage = "The <Package Name> <verb> experienced a delay in shipping";
            String message = "message: The <Package Name> should arrive within "+days+" business days.";
            return ("\n"+delayMessage+"\n"+message);
        }
        else{
            return ("The package will be shipped within "+days+" business days");
        }
    }
}
