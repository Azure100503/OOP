package patterns.behavioral.observer.demo;


import java.util.LinkedList;
import java.util.List;

public class Subject {
    private List<Observer> observers;
    private int state;

    public Subject(int state) {
        observers = new LinkedList<>();
        this.state = state;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        if (this.state == state) {
            return;
        }
        this.state = state;

        //emit signal or event
        // handle signal -> listener -> onStateChanged

        onStateChanged();
    }

    public void attach(Observer o) {
        observers.add(o);

    }

    public void notifyAllObservers() {
        for (Observer o :  observers
             ) {
            o.update();
        }
    }

    private void onStateChanged() {
        notifyAllObservers();
    }
}
