package com.cs.hit.learn.thinkinginjava.concurrency.example.executor.returnvalue;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Future<String>> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            result.add((Future<String>) executorService.submit(new MyCallable()));
        }
        for(Future<String> tmp : result) {
            try {
                //block 
                System.out.println(tmp.get());
            }catch (InterruptedException e) {
                System.out.println(e);
                return;
            }catch (ExecutionException e) {
                System.out.println(e);
            }finally {
                executorService.shutdown();
            }
        }
    }
}
