package com.hit.learn.thinkinginjava.concurrency.thread.sharingresources.implicitlock;

/**
 * Created by Acceml on 2016/3/19.
 */
public class EvenGenerator extends IntGenerator {
    private int concurrentEvenValue = 0;

    @Override
    synchronized public int next() {
        ++concurrentEvenValue;
        ++concurrentEvenValue;
        return concurrentEvenValue;
    }

    @Override
    public void cancel() {
        super.cancel();
    }

    @Override
    public boolean isCancelded() {
        return super.isCancelded();
    }

    public static void main(String [] args) {
        EvenChecker.test(new EvenGenerator());
    }
}
