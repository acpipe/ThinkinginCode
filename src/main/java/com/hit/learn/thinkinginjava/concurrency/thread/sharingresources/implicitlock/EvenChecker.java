package com.hit.learn.thinkinginjava.concurrency.thread.sharingresources.implicitlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Acceml on 2016/3/19.
 */
class EvenChecker implements Runnable {

    private IntGenerator intGenerator;

    private final int id;

    EvenChecker(IntGenerator intGenerator, int id) {
        this.intGenerator = intGenerator;
        this.id = id;
    }

    @Override
    public void run() {
        while (!intGenerator.isCancelded()) {
            int val = intGenerator.next();
            if (val % 2 != 0) {
                System.out.println(val + "is not even!");
                intGenerator.cancel();
            }
        }
    }

    public static void test(IntGenerator gp, int count) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++) {
            executorService.execute(new EvenChecker(gp, count));
        }
        executorService.shutdown();
    }

    public static void test(IntGenerator gp) {
        test(gp, 10);
    }
}
