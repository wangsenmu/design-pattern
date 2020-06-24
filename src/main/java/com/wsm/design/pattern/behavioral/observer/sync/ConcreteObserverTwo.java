package com.wsm.design.pattern.behavioral.observer.sync;

/**
 * @author wangsenmu
 * @date 2020-6-23 11:00
 */
public class ConcreteObserverTwo implements Observer {
    @Override
    public void update(Message message) {
        //TODO: 获取消息通知，执行自己的逻辑...
        System.out.println("ConcreteObserverTwo is notified.");
    }
}