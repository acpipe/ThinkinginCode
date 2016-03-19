package com.hit.learn.designpatten.proxy;

import java.lang.reflect.Proxy;
import java.util.concurrent.Callable;

public class TestJavaProxy {
    public static void main(String[] args) throws Exception {
        Phone phone = new Phone();
        Callable proxyPhone = (Callable) Proxy.newProxyInstance(
                phone.getClass().getClassLoader(),
                phone.getClass().getInterfaces(),
                new FirstInvocationHandler(phone));
        proxyPhone.call();
    }
}
