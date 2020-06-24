package com.wsm.design.pattern.behavioral.observer.eventbus;

import java.util.concurrent.Executor;

/**
 * @author wangsenmu
 * @date 2020-6-23 18:22
 */
public class AsyncEventBus extends EventBus {
    public AsyncEventBus(Executor executor) {
        super(executor);
    }
}