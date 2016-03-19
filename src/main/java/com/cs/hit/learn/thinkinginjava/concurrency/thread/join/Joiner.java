package com.cs.hit.learn.thinkinginjava.concurrency.thread.join;

//join to A thread,wait for A thread
class Joiner extends Thread {
    private Sleeper sleeper;

    public Joiner(String name, Sleeper sleeper) {
        super(name);
        this.sleeper = sleeper;
        start();
    }

    public void run() {
        try {
            sleeper.join();
        } catch (InterruptedException e) {
            System.out.println(" interrupted");
        }
        System.out.println(getName() + " join completed.");
    }
}
