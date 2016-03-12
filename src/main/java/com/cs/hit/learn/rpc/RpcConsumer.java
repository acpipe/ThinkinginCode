package com.cs.hit.learn.rpc;

/**
 * Created by Acceml on 2016/3/12.
 */
public class RpcConsumer {
    public static void main(String[] args) {
        try {
            HelloService service = RpcFramework.refer(HelloService.class, "192.168.219.1", 1234);
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                String hello = service.sayHello(":" + i);
                System.out.println(hello);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
