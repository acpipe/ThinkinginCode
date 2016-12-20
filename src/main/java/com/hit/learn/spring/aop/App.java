package com.hit.learn.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Acceml on 2016/10/9.
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("aop-demo.xml");

        CustomerBo customer = (CustomerBo) appContext.getBean("customerBo");
//        customer.addCustomer();

//        customer.addCustomerReturnValue();

//        customer.addCustomerThrowException();

        customer.addCustomerAround("mkyong");

    }
}
