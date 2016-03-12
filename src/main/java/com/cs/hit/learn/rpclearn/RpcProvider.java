package com.cs.hit.learn.rpclearn;

/**
 * Created by Acceml on 2016/3/12.
 */
public class RpcProvider {
    public static void main(String[] args) {
        HelloServiceImpl helloService = new HelloServiceImpl();
        try {
            RpcFramework.export(helloService, 1234);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
