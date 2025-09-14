package state;

public class DeliveredState extends State {
    
    public DeliveredState(Package pkg){
        super(pkg);
    }

    public String getStatus(){
        return ("The "+pkg.getName()+" arrived");
    }

    public String getETA(){
        return ("The "+pkg.getName()+" here");
    }
}
