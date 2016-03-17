package com.cs.hit.learn.thinkinginjava.concurrency.example.thread.create;

public class NewThreadApproach {

    public void createThreadWay1() {
        new Thread(new MyRunnable()).start();
    }

    public void createThreadWya2() {
        new Mythread().start();
    }

    public void createThreadWay3() {
        new Thread(new Runnable() {
            public void run() {
                System.out.println("in way3");
            }
        }).start();
    }

    public static void main(String [] args) {
        NewThreadApproach newThreadApproach=new NewThreadApproach();
        newThreadApproach.createThreadWay1();
        newThreadApproach.createThreadWya2();
        newThreadApproach.createThreadWay3();
    }
}
