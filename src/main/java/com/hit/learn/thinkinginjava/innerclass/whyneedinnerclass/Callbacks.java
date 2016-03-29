package com.hit.learn.thinkinginjava.innerclass.whyneedinnerclass;

/**
 * Created by Acceml on 2016/3/29
 * Email: huminghit@gmail.com
 */
public class Callbacks {
    public static void main(String [] args) {
        Callee1 c1=new Callee1();
        Callee2 c2=new Callee2();
        MyIncrement.f(c2);
        Caller caller1=new Caller(c1);
        Caller caller2=new Caller(c2.getCallbackRef());
        caller1.go();
        caller2.go();
        caller1.go();
        caller2.go();
    }
}
