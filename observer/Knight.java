package observer;

public class Knight implements Observer {
    /*
     * creates a Knight and registers it with information
     * @param watchman for the warning of subjects
     * @param greeter for the non warning message to subjects
     */
    public Knight(Subject watchman, Subject greeter) {
        if (watchman != null) watchman.registerObserver(this);
        if (greeter != null) greeter.registerObserver(this);
    }

    /*
     * update uses the warning and the users choice to know what message to display
     * @param takes in boolean weather or not its a warning and the users choice
     */
    public void update(boolean warning, int note) {
        if (warning) {
            if(note==1){ System.out.println("Knight: Gather the other knights to defend the city");}
            else{System.out.println("Knight: Fighting off the intruders"); }
        } else {
            if(note==1){ System.out.println("Knight: Brining the messager into the city");}
            else{System.out.println("Knight: Rolling out the red carpet for royalty"); }
        }
    }       
}