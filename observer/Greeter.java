package observer;
/*
 * The greeter class extends from subject and issues the trumpet fanfare based
 * off who is approching the city and notifys. 
 */
public class Greeter extends Subject {
    /*
     * issues notice from the greeter, either on or two fanfare trumpets 
     * based off the users choice. 
     * @param note indicates the number of trumpet noises made
     */
    public void issueNotice(int note) { 
        System.out.println("Trumpet fanfare plays "+note+" time(s)");
        Trumpet.play(false, note);
        notifyObservers(note); 
    }
    
    /*
     * notifies the observer of user choice
     * @param note indicates what to notify the observers about
     * so they give corrisponding message
     */
    public void notifyObservers(int note) {
        for (Observer observer : observers) {
            observer.update(false, note);
        }
    }
}
