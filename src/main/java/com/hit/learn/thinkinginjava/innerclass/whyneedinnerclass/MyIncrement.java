package com.hit.learn.thinkinginjava.innerclass.whyneedinnerclass;

/**
 * Created by Acceml on 2016/3/29
 * Email: huminghit@gmail.com
 */
class MyIncrement {
    public void increment() {
        System.out.println("other op");
    }
    static void f(MyIncrement mi) {
        mi.increment();
    }
}
