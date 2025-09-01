package observer;
/*
 * Teacher class implimented from observer responds to the subjects notification
 */
public class Teacher implements Observer {
     /*
     * creates a Knight and registers it with information
     * @param watchman for the warning of subjects
     * @param greeter for the non warning message to subjects
     */
    public Teacher(Subject watchman, Subject greeter) {
        if (watchman != null) watchman.registerObserver(this);
        if (greeter != null) greeter.registerObserver(this);
    }

    /*
     * update uses the warning and the users choice to know what message to display
     * @param takes in boolean weather or not its a warning and the users choice
     */
    public void update(boolean warning, int note) {
        if (warning) {
            if(note==1){ System.out.println("Teacher: Sending the children home early");}
            else{System.out.println("Teacher: Locking the doors and staying safe"); }
        } else {
            if(note==1){ System.out.println("Teacher: Teaching the children");}
            else{System.out.println("Teacher: Taking the children to watch the royalty come in"); }
        }
    }
}
