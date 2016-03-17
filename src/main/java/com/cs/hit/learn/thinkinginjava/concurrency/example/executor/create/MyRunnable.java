package com.cs.hit.learn.thinkinginjava.concurrency.example.executor.create;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("in executor");
    }
}
