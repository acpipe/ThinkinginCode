package com.cs.hit.learn.designpatten.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class FirstInvocationHandler implements InvocationHandler{
    private Object o;

    public FirstInvocationHandler(Object o) {
        this.o = o;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before invoke");
        method.invoke(o,args);
        System.out.println("after invoke");
        return null;
    }
}
