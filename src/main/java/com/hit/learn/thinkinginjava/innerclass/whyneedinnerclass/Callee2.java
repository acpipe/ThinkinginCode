package com.hit.learn.thinkinginjava.innerclass.whyneedinnerclass;

/**
 * Created by Acceml on 2016/3/29
 * Email: huminghit@gmail.com
 */
class Callee2 extends MyIncrement {
    private int i = 0;

    public void increament() {
        super.increment();
        i++;
        System.out.println(i);
    }
    private class Closure implements Incrementable {
        @Override
        public void incement() {
            Callee2.this.increament();
        }
    }
    Incrementable getCallbackRef() {
        return new Closure();
    }
}
