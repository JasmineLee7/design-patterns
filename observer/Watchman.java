package observer;
    /*
    * The watchman class extends subject and sends out warnings to 
    * subjects and sounds the horn to warn them, once or twice.
    */
    public class Watchman extends Subject {

    /*
     * issues notice from the Watchman, either on or two horn trumpets 
     * based off the users choice. 
     * @param note indicates the number of trumpet noises made
     */
    public void issueNotice(int note) { 
        System.out.println("Trumpet horn plays "+note+" time(s)");
        Trumpet.play(true, note);
        notifyObservers(note);
     }

    /*
    * notifies the observer of user choice
    * @param note indicates what to notify the observers about
    * so they give corrisponding message
    */
    public void notifyObservers(int note) {
        for (Observer observer : observers) {
            observer.update(true, note);
        }
    }
}
