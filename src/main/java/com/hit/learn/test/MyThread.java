package com.hit.learn.test;

/**
 * Created by Acceml on 2017/5/9.
 */
public class MyThread extends Thread {
    public MyThread(C cc) {
        this.cc = cc;
    }

    private C cc;

    @Override
    public void run() {
        cc.setvalue(20);
        Test.callback();//很像C#的委托和事件
    }
}
