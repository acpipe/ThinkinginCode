package com.hit.learn.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Acceml on 2016/10/9.
 */
public class StartApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-demo.xml");
        App obj = (App) context.getBean("app");
        System.out.println(obj.getAppName());
    }
}
