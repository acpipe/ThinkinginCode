package com.hit.learn.thinkinginjava.concurrency.executor.create;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachePoll {
    public static void main(String [] args) {
        ExecutorService executorServic = Executors.newFixedThreadPool(5);
        for(int i=0;i<10;i++) {
            executorServic.execute(new MyThread());
            executorServic.execute(new MyRunnable());
        }
    }
}
