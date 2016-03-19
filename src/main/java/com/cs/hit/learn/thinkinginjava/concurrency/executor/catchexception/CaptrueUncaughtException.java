package com.cs.hit.learn.thinkinginjava.concurrency.executor.catchexception;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Acceml on 2016/3/18.
 */
public class CaptrueUncaughtException {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool(new HandlerThreadFactory());
        executorService.execute(new ExceptionThread2());
    }
}
