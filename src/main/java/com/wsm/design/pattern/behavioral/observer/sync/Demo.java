package com.wsm.design.pattern.behavioral.observer.sync;

/**
 * @author wangsenmu
 * @date 2020-6-23 11:01
 *
 * 同步阻塞的实现方式
 * 除此之外还可以做异步非阻塞（线程池、多线程）、进程内、进程间 （消息队列）
 */
public class Demo {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.registerObserver(new ConcreteObserverOne());
        subject.registerObserver(new ConcreteObserverTwo());
        subject.notifyObservers(new Message());
    }
}