package state;

public class Package {
    private String name;
    private int quantity;
    OrderedState orderedState = new OrderedState();
    DeliveredState deliveredState = new DeliveredState();

    public void Package(String name, int quantity){}

    public String order(){
        return "";
    }

    public String mail(){
        return "";
    }

    public String recieved(){
        return "";
    }

    public void setState(State state){}

    public String getName(){
        return "";
    }

    public String getVerb(String singular, String plural){
        return "";
    }

}
