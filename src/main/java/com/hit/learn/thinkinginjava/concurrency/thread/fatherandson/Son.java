package com.hit.learn.thinkinginjava.concurrency.thread.fatherandson;

/**
 * Created by Acceml on 2016/3/18.
 */
class Son implements Runnable{
    @Override
    public void run() {
        while(true) {
            System.out.println("in son thread");
        }
    }
}
