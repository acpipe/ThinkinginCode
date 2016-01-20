package com.cs.hit.thinkinginjava.concurrency.example.ex2;

import java.util.concurrent.TimeUnit;

/**
 * Created by Acceml on 2016/1/20.
 */
public class SimpleDaemons implements Runnable {
    @Override
    public void run() {
        try {
            while (true) {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread());
            }
        } catch (InterruptedException e) {
            System.out.println("sleep() interrupted");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread daemon = new Thread(new SimpleDaemons());
            daemon.setDaemon(true);
            daemon.start();
        }
        System.out.println("all daemon started");
        TimeUnit.MILLISECONDS.sleep(100);
    }
}
