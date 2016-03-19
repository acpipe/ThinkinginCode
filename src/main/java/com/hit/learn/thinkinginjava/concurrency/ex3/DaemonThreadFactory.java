package com.hit.learn.thinkinginjava.concurrency.ex3;

import java.util.concurrent.ThreadFactory;

/**
 * Created by Acceml on 2016/1/20.
 */
public class DaemonThreadFactory implements ThreadFactory{
    @Override
    public Thread newThread(Runnable r) {
        Thread t =new Thread(r);
        t.setDaemon(true);
        return null;
    }
}
