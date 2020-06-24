package com.wsm.design.pattern.behavioral.observer.demo;

/**
 * @author wangsenmu
 * @date 2020-6-23 17:14
 */
public class RegNotificationObserver implements RegObserver {

    private NotificationService notificationService;

    @Override
    public void handleRegSuccess(long userId) {
        notificationService.sendInboxMessage(userId, "Welcome...");
    }

}