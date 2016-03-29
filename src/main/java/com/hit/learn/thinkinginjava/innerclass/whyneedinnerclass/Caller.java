package com.hit.learn.thinkinginjava.innerclass.whyneedinnerclass;

/**
 * Created by Acceml on 2016/3/29
 * Email: huminghit@gmail.com
 */
class Caller {
    private Incrementable callbackRef;

    public Caller(Incrementable callbackRef) {
        this.callbackRef = callbackRef;
    }
    void go() {
        callbackRef.incement();
    }
}
