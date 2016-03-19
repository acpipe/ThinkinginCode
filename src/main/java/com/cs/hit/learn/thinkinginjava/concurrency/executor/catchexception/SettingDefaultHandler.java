package com.cs.hit.learn.thinkinginjava.concurrency.executor.catchexception;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Acceml on 2016/3/18.
 */
public class SettingDefaultHandler {
    public static void main(String [] args) {
        Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        ExecutorService executorService= Executors.newCachedThreadPool();
        executorService.execute(new ExceptionThread2());
    }
}
