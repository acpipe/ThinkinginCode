package com.hit.learn.spring.anointerface;

import com.hit.learn.spring.anointerface.biz.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Acceml on 2016/10/24.
 */
public class MockTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("mock-test.xml");
        A obj = (A) context.getBean("a");
        System.out.println(obj.getB().getC().getD().getValue());
    }
}
