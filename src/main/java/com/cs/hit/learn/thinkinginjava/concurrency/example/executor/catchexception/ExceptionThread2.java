package com.cs.hit.learn.thinkinginjava.concurrency.example.executor.catchexception;

/**
 * Created by Acceml on 2016/3/18.
 */
class ExceptionThread2 implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("run by " + t);
        System.out.println("eh= "+ t.getUncaughtExceptionHandler());
        throw new RuntimeException();
    }
}
