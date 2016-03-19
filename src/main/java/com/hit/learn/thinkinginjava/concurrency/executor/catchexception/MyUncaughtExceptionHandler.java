package com.hit.learn.thinkinginjava.concurrency.executor.catchexception;

/**
 * Created by Acceml on 2016/3/18.
 */
class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("caught" + e);
    }
}
