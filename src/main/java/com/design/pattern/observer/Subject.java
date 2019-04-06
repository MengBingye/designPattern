package com.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @create: 2019/04/06 11:20
 */

public class Subject {


    public List<Observer> observers = new ArrayList<>();

    public int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
