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
        int delayChance = 1;//random.nextInt(10);
        // plus 1 so that it gives numbers between 1 and 3, not 0 and 2.
        int delayLength = random.nextInt(3)+1;

        // 20% chance
        if(delayChance<=1){
            days = days+delayLength;

            String delayMessage = ("The "+pkg.getName()+pkg.getVerb(" has","'s have")+" experienced a slight delay in manufacturing.");
            String message = "The "+pkg.getName()+pkg.getVerb("","'s")+" will be shipped within "+days+" business days";

            return ("\n"+delayMessage+"\n"+message);
        }
        else{
            return ("The package will be shipped within "+days+" business days");
        }
    }
}
