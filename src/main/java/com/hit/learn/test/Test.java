package com.hit.learn.test;


/**
 * Created by Acceml on 2016/10/12.
 */
public class Test {
    //flag用来标志子线程执行结束
    static boolean flag = false;
    static C c = new C();

    public static void main(String[] arg) {
        c.setvalue(12);
        System.out.println("子线程执行之前value的值是：" + c.getvalue());
        System.out.println("执行子线程");


        Thread mythread = new MyThread(c);
        mythread.start();

        //等待子线程执行结束
        while (!flag) ;
        System.out.println("子线程执行之后value的值是：" + c.getvalue());
    }

    public static void callback() {
        System.out.println("子线程执行结束");
        flag = true;
    }


}
