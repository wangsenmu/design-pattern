package com.wsm.design.pattern.behavioral.observer.demo;

/**
 * @author wangsenmu
 * @date 2020-6-23 17:14
 */
public class RegPromotionObserver implements RegObserver {


    private PromotionService promotionService; // 依赖注入

    @Override
    public void handleRegSuccess(long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}