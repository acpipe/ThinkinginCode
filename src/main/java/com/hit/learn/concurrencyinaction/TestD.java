package com.hit.learn.concurrencyinaction;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestD {
    public static void main(String[] args) throws InterruptedException {
        Thread1 thread = new Thread1();
        Thread thread1 = new Thread(thread);
        thread1.start();
        thread1.join();
        System.out.println("hello");
    }

    private static class Thread1 implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread1 started!");
//            synchronized (TestD.class) {
//                try {
//                    Thread.sleep(5000);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//                System.out.println("thread1 is over!!!");
//            }
            ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
            scheduledExecutorService.schedule(new Work(1), 1, TimeUnit.MILLISECONDS);
        }
    }
}
