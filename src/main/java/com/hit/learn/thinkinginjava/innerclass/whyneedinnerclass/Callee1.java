package com.hit.learn.thinkinginjava.innerclass.whyneedinnerclass;

/**
 * Created by Acceml on 2016/3/29
 * Email: huminghit@gmail.com
 */
class Callee1 implements Incrementable {
    private int i = 0;

    @Override
    public void incement() {
        i++;
        System.out.println(i);
    }
}
