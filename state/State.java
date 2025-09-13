package state;

import java.util.Random;

public class State {
    protected Package pkg = new Package();
    protected Random random = new Random();

    public void State(Package pkg){}

    public String getStatus(){
        return "";
    }

    public String getETA(){
        return "";
    }
}
