package com.hit.learn.concurrencyinaction;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Work extends Thread {
    private int id = 0;

    public Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Work线程"  + id + "---"+ i + "次执行.");
            synchronized (Work.class) {
                try {
                    Work.class.wait(1);
                    //Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
//        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
//        scheduledExecutorService.schedule(new Work(), 1, TimeUnit.SECONDS);
//        System.out.println("test");
        Work work = new Work(1);
        work.start();
        Work work1 = new Work(2);
        work1.start();
    }

}
