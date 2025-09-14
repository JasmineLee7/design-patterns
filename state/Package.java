package state;

public class Package {
    private String name;
    private int quantity;
    OrderedState orderedState;
    DeliveredState deliveredState;
    InTransitState inTransitState;

    public Package(String name, int quantity){
        this.quantity = quantity;
        this.name = name;

        orderedState = new OrderedState(this);
        deliveredState = new DeliveredState(this);
        inTransitState = new InTransitState(this);
    }

    public String order(){
        return (orderedState.getStatus()+"\n"+orderedState.getETA());
    }

    public String mail(){
        return (inTransitState.getStatus()+"\n"+inTransitState.getETA());
    }
    
    public String received(){
        return (deliveredState.getStatus()+"\n"+deliveredState.getETA());
    }

    public void setState(State state){}

    public String getName(){
        return name;
    }

    public String getVerb(String singular, String plural){
        if(quantity==1){
            return singular;
        }
        else{
            return plural;
        }
    }
}
