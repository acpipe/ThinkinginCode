package com.cs.hit.learn.rpc;

/**
 * Created by Acceml on 2016/3/12.
 */
public class HelloServiceImpl implements HelloService {

    public String sayHello(String name) {
        return "hello world" + name;
    }
}
