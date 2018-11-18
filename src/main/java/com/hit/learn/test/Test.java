package com.hit.learn.test;


import org.apache.commons.lang.Validate;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.StampedLock;

/**
 * Created by Acceml on 2016/10/12.
 */
public class Test {

    public static void main(String[] arg) {
        Validate.notNull(null, "first");
    }
}
