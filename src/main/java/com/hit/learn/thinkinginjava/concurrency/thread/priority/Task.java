package com.hit.learn.thinkinginjava.concurrency.thread.priority;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                executorService.execute(new Priority(Thread.MAX_PRIORITY, i));
            } else {
                executorService.execute(new Priority(Thread.MIN_PRIORITY, i));
            }
        }
    }
}
