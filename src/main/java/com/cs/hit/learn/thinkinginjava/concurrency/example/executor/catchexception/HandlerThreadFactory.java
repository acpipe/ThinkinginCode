package com.cs.hit.learn.thinkinginjava.concurrency.example.executor.catchexception;

import java.util.concurrent.ThreadFactory;

/**
 * Created by Acceml on 2016/3/18.
 */
class HandlerThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        System.out.println(this + "create new Thread");
        Thread t = new Thread(r);
        System.out.println("create thread" + t );
        t.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        return t;
    }
}
