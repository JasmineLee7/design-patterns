package state;

public class InTransitState extends State{
    private int days = 5;

    public InTransitState(Package pkg){
        super(pkg);
    }

    public String getStatus(){
        return ("The "+pkg.getName()+pkg.getVerb(" is","'s are")+" in transit");
    }

    public String getETA(){
        int delayChance = random.nextInt(10);
        int delayLength = random.nextInt(7)+1;
       
        // 30% chance
        if(delayChance<=2){
            days = days+delayLength;
            String delayMessage = ("The "+pkg.getName()+pkg.getVerb(" has","'s have")+" experienced a delay in shipping");
            String message = ("The "+pkg.getName()+pkg.getVerb("","'s")+" should arrive within "+days+" business days.");
            return (delayMessage+"\n"+message);
        }
        else{
            return ("The "+pkg.getName()+pkg.getVerb("","'s")+" will arrive within "+days+" business days");
        }
    }
}
