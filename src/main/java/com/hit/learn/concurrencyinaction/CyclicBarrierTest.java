package com.hit.learn.concurrencyinaction;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {
    private static CyclicBarrier cyclicBarrier;

    public static class PrepareReadDataThread extends Thread {
        private int id;

        PrepareReadDataThread(int id) {
            this.id = id;
        }

        public void run() {
            try {
                System.out.println("线程：" + this.id + " 可以读数据啦!");
                cyclicBarrier.await();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("所有任务完毕，继续处理其他任务... "+System.currentTimeMillis());
        }
    }

    public static class PrepareWriteDataThread extends Thread {
        private int id;

        PrepareWriteDataThread(int id) {
            this.id = id;
        }

        public void run() {
            try {
                Thread.sleep(3000);
                System.out.println("线程：" + this.id + " 可以load写数据完成!");
                cyclicBarrier.await();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("所有任务完毕，继续处理其他任务... "+System.currentTimeMillis());
        }
    }


    public static void main(String[] args) {
        cyclicBarrier = new CyclicBarrier(5, () -> System.out.println("测试开始!"));
        for (int i = 0; i < 5; i++) {
            new PrepareReadDataThread(i).start();
        }
        //重置一下
        cyclicBarrier.reset();

        for (int i = 0; i < 5; i++) {
            new PrepareWriteDataThread(i).start();
        }
    }
}
