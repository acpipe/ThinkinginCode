package com.cs.hit.learn.thinkinginjava.concurrency.thread.sleeping;

import java.util.concurrent.TimeUnit;

class SleepingTask implements Runnable{

    private int i=0;

    public SleepingTask(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("in tread" + i );
        try {
            TimeUnit.MICROSECONDS.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
