package com.cs.hit.learn.designpatten.proxy;

import java.util.concurrent.Callable;

public class Phone implements Callable {
    public Object call() throws Exception {
        long startTime = System.currentTimeMillis();
        System.out.println("Phone is calling ...");
        long endTime = System.currentTimeMillis();
        System.out.println("Call duration = " + (endTime - startTime));
        return null;
    }
}
