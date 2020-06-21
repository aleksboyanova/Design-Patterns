package observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {

    private List<Observer> observers = new ArrayList<Observer>();

    public void adding(Observer observer) {
        observers.add(observer);
    }

    public void removing(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObs() throws InterruptedException {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
