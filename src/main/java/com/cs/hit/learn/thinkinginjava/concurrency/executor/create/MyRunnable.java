package com.cs.hit.learn.thinkinginjava.concurrency.executor.create;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("in executor");
    }
}
