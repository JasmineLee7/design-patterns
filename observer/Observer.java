package observer;
/*
 * The observer interface is a relativly simple class 
 * It is used for the two observers "Greeter" and "Watchman"
 */
public interface Observer {
    public void update(boolean warning, int note);
}
