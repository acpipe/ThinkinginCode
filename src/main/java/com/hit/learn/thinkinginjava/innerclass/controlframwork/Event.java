package com.hit.learn.thinkinginjava.innerclass.controlframwork;

/**
 * Created by Acceml on 2016/3/29
 * Email: huminghit@gmail.com
 */
public abstract class Event {
    private long eventTime;
    protected final long delayTime;

    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }

    public void start() {
        eventTime = System.nanoTime() + delayTime;
    }

    public boolean ready() {
        return System.nanoTime() >= eventTime;
    }
    public abstract void action();
}
