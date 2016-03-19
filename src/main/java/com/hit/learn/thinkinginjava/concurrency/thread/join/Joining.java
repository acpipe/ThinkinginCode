package com.hit.learn.thinkinginjava.concurrency.thread.join;

public class Joining {
    public static void main(String[] args) {
        Sleeper sleeper=new Sleeper("sleepy",1500);
        Sleeper grumpy=new Sleeper("grumpy",1500);
        Joiner doc1=new Joiner("doc1",sleeper);
        Joiner doc2=new Joiner("doc2",grumpy);
        grumpy.interrupt();
    }
}
