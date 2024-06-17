package Behavioural.Observer;

import java.util.ArrayList;
import java.util.List;

public class NumberStore {
    List<Observer> observers = new ArrayList<>();
    private int number = 0;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        for (Observer o : observers) {
            o.processChange(number);
        }
    }

    public void addObserver(Observer obs) {
        observers.add(obs);
    }
}
