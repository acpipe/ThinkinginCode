package com.hit.learn.hystrix;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

public class CommandHelloWorld extends HystrixCommand<String> {

    private final String name;

    public CommandHelloWorld(String name) {
        super(HystrixCommandGroupKey.Factory.asKey("ExampleGroup")); //必须
        this.name = name;
    }

    @Override
    protected String run() {
        /*
         网络调用 或者其他一些业务逻辑，可能会超时或者抛异常
        */
        return "Hello " + name + "!";
    }

    public static void main(String[] args) {
        String s = new CommandHelloWorld("World").execute();
        System.out.println(s);
    }
}