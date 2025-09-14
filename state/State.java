package state;

import java.util.Random;

public abstract class State {
    protected Package pkg;
    protected Random random;

    public State(Package pkg){
        this.pkg = pkg;
        this.random = new Random();
    }

    public abstract String getStatus();

    public abstract String getETA();
}
