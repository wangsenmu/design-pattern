package com.wsm.design.pattern.behavioral.observer.sync;

/**
 * @author wangsenmu
 * @date 2020-6-23 10:58
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(Message message);

}