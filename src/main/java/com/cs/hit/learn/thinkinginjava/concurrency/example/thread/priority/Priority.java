package com.cs.hit.learn.thinkinginjava.concurrency.example.thread.priority;

public class Priority implements Runnable {

    private  int priority;

    private int id;

    public Priority(int priority,int id) {
        this.priority = priority;
        this.id=id;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(priority);
        System.out.println(id);
    }
}
