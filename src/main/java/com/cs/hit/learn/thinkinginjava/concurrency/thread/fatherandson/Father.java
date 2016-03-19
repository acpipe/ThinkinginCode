package com.cs.hit.learn.thinkinginjava.concurrency.thread.fatherandson;

/**
 * Created by Acceml on 2016/3/18.
 */
public class Father  implements Runnable{
    @Override
    public void run() {
        new Thread(new Son()).start();
        System.out.println("father thread run over");
    }
    public static void main(String [] args) {
        new Thread(new Father()).start();
    }
}
