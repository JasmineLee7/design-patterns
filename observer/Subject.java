package observer;
import java.util.ArrayList;
/* 
 * The subject class is the base for Knight, Shop Owner, and Teacher
 * it can register and remove observers and has the abstract classes to issue and notify them.
 */
public abstract class Subject {
    
    protected ArrayList<Observer> observers = new ArrayList<>();
    
    // from uml
    public Subject(){};

    /* 
     * creates a new observer 
     * @param observer to be registered
     */
    public void registerObserver(Observer observer) { 
        if (observer != null && !observers.contains(observer)) observers.add(observer); 
    }

    /* 
     * Removes a created observers 
     * @param observer to be removed
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer); 
    }

    /*
     * notifies subjects
     * @param note the users choice sent to the observer 
     */
    public abstract void issueNotice(int note);

    /**
     * notifies the observers of the users choice
     * @param note the users choice send to the observers
     */
    public abstract void notifyObservers(int note);
}
