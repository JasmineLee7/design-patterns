package observer;

public class ShopOwner implements Observer {

     /*
     * creates a Knight and registers it with information
     * @param watchman for the warning of subjects
     * @param greeter for the non warning message to subjects
     */
    public ShopOwner(Subject watchman, Subject greeter) {
        if (watchman != null) watchman.registerObserver(this);
        if (greeter != null) greeter.registerObserver(this);
    }

    /*
     * update uses the warning and the users choice to know what message to display
     * @param takes in boolean weather or not its a warning and the users choice
     */
    public void update(boolean warning, int note) {
        if (warning) {
            if(note==1){ System.out.println("Shop Owner: Putting away the display items");}
            else{System.out.println("Shop Owner: Locking the door and hiding in the backrooms"); }
        } else {
            if(note==1){ System.out.println("Shop Owner: Running business as usual");}
            else{System.out.println("Shop Owner: Putting out the finest china on display"); }
        }
    }
}
