package com.cs.hit.thinkinginjava.concurrency.example.sleeping;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecTask {
    public static void main(String [] args) {
        ExecutorService executorService= Executors.newCachedThreadPool();
        for (int i=0;i<10;i++) {
            executorService.execute(new SleepingTask(i));
        }
        executorService.shutdown();
    }
}
