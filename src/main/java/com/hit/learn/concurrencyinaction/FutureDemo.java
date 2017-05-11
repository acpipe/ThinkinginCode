package com.hit.learn.concurrencyinaction;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

/**
 * Created by Acceml on 2017/5/11.
 * 异步化.
 */
public class FutureDemo {
    private final ExecutorService executorService = new ScheduledThreadPoolExecutor(100);

    public void readerPage(String source) {
        final List<String> imgUrls = new ArrayList<>();
        //I/O busy task
        Callable<List<String>> task = new Callable<List<String>>() {
            @Override
            public List<String> call() throws Exception {
                List<String> enhanceImgUrls = new ArrayList<>();
                for(int i =0; i <5; i++) {
                    enhanceImgUrls.add(String.valueOf(i));
                    System.out.println("In callable task." + String.valueOf(i));
                }
                //RPC
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for(int i =6; i < 10; i++) {
                    enhanceImgUrls.add(String.valueOf(i));
                    System.out.println("In callable task." + String.valueOf(i));
                }
                return enhanceImgUrls;
            }
        };

        Future<List<String>> enhanceImgUrlsFuture = executorService.submit(task);

        //CPU busy task.
        try {
            Thread.sleep(1000L);
            for(int i =0; i < 10; i++) {
                imgUrls.add("normal img url:" + String.valueOf(i));
                System.out.println("normal img url:" + String.valueOf(i));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        mergeResultImgs(imgUrls, enhanceImgUrlsFuture);
    }

    private void mergeResultImgs(List<String> imgUrls, Future<List<String>> enhanceImgUrlsFuture) {
        //merge result
        try {
        List<String> enhanceImgUrl = enhanceImgUrlsFuture.get();
        imgUrls.addAll(enhanceImgUrl.stream().map(item -> "enhance Url from RPC:" + item).collect(Collectors.toList()));
        System.out.println("-------------------");
        for(String item : imgUrls) {
            System.out.println(item);
        }
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        enhanceImgUrlsFuture.cancel(true);
    } catch (ExecutionException e) {
        e.printStackTrace();
    }
}

    public static void main(String[] args) {
        FutureDemo futureDemo = new FutureDemo();
        futureDemo.readerPage("hello");
    }
}
