//package com.cs.hit.thinkinginjava.concurrency.example.ex5;

public class MainThread implements Runnable {
    public void run() {
        for (int i = 0; i < 10000; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.activeCount());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Thread thread = new Thread(new MainThread());
        // thread.start();
//        Thread thread=Thread.currentThread();
//        System.out.println(thread.getName());
//        System.out.println(Thread.activeCount());
        Thread th[] = new Thread[Thread.activeCount()];
        Thread.enumerate(th);
        for (Thread thread : th) {
            System.out.println(thread);
        }
    }
}
