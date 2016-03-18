package com.cs.hit.learn.thinkinginjava.concurrency.example.thread.responsiveconsole;

/**
 * Created by Acceml on 2016/3/18.
 */
class Unresponsive {
    private volatile double d = 1;

    public Unresponsive() throws Exception {
        while (d > 0) {
            d = d + (Math.PI + Math.E) / d;
        }
    }
}
