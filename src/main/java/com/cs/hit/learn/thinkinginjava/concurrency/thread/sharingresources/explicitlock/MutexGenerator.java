package com.cs.hit.learn.thinkinginjava.concurrency.thread.sharingresources.explicitlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Acceml on 2016/3/19.
 */
public class MutexGenerator extends IntGenerator{

    private int concurrentEvenValue = 0;

    private Lock lock=new ReentrantLock();

    @Override
    public int next() {
        lock.lock();
        try {
            ++concurrentEvenValue;
            ++concurrentEvenValue;
            return concurrentEvenValue;
        } finally {
            lock.unlock();
        }
    }

    public static void main(String [] args) {
        EvenChecker.test(new MutexGenerator());
    }

}
