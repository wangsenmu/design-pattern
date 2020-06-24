package com.wsm.design.pattern.behavioral.observer.sync;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangsenmu
 * @date 2020-6-23 10:59
 */
public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Message message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}