package state;

public class DeliveredState extends State {
    
    public DeliveredState(Package pkg){
        super(pkg);
    }

    public String getStatus(){
        return ("The "+pkg.getName()+pkg.getVerb(" has","'s have")+" arrived");
    }

    public String getETA(){
        return ("The "+pkg.getName()+pkg.getVerb(" is","'s are")+" here");
    }
}
