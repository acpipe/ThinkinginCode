package com.hit.learn.test;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.StampedLock;

/**
 * Created by Acceml on 2016/10/12.
 */
public class Test {
    public static void main(String[] arg) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        StampedLock lock = new StampedLock();
        executor.submit(() -> {
            long stamp = lock.tryReadLock();
            try {
                System.out.println("Optimistic Lock Valid: " + lock.validate(stamp));
                ConcurrentUtils.sleep(1);
                System.out.println("Optimistic Lock Valid: " + lock.validate(stamp));
                ConcurrentUtils.sleep(2);
                System.out.println("Optimistic Lock Valid: " + lock.validate(stamp));
                ConcurrentUtils.sleep(2);
                System.out.println("Optimistic Lock Valid: " + lock.validate(stamp));
                ConcurrentUtils.sleep(2);
                System.out.println("Optimistic Lock Valid: " + lock.validate(stamp));
                ConcurrentUtils.sleep(2);
                System.out.println("Optimistic Lock Valid: " + lock.validate(stamp));
            } finally {
                lock.unlock(stamp);
            }
        });
        executor.submit(() -> {
            long stamp = lock.writeLock();
            try {
                System.out.println("Write Lock acquired");
                ConcurrentUtils.sleep(2);
            } finally {
                lock.unlock(stamp);
                System.out.println("Write done");
            }
        });
        ConcurrentUtils.stop(executor);
    }
}
