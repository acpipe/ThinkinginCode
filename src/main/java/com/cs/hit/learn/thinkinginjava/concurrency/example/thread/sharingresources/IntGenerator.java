package com.cs.hit.learn.thinkinginjava.concurrency.example.thread.sharingresources;

/**
 * Created by Acceml on 2016/3/19.
 */
abstract class IntGenerator {
    private volatile boolean cancelded =false;
    public abstract int next();
    public void cancel() {
        cancelded=true;
    }
    public boolean isCancelded() {
        return cancelded;
    }
}
