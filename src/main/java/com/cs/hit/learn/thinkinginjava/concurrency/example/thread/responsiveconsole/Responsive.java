package com.cs.hit.learn.thinkinginjava.concurrency.example.thread.responsiveconsole;

import java.io.IOException;

/**
 * Created by Acceml on 2016/3/18.
 */
class Responsive extends Thread {
    private volatile static double d = 1;

    public Responsive() {
        setDaemon(true);
        start();
    }

    @Override
    public void run() {
        while (true) {
            d = d + (Math.PI + Math.E) / d;
        }
    }

    public static void main(String[] args) throws IOException {
        new Responsive();
        System.in.read();
        System.out.println(d);
    }
}
