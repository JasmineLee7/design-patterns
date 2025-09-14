package state;

public class OrderedState extends State{
    private int days = 2;

    public OrderedState(Package pkg){
        super(pkg);
    }

    public String getStatus(){
        return ("the "+pkg.getName()+pkg.getVerb(" is","'s are")+" ordered");
    }

    public String getETA(){
        int delayChance = random.nextInt(10);
        int delayLength = random.nextInt(3)+1;
        
        // 20% chance
        if(delayChance<=1){
            days = days+delayLength;
            String delayMessage = ("The "+pkg.getName()+pkg.getVerb(" has","'s have")+" experienced a slight delay in manufacturing.");
            String message = ("The "+pkg.getName()+pkg.getVerb("","'s")+" will be shipped within "+days+" business days");
            return (delayMessage+"\n"+message);
        }
        else{
            return ("The "+pkg.getName()+pkg.getVerb("","'s")+" will be shipped within "+days+" business days");
        }
    }
}
