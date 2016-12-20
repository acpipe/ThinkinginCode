package com.hit.learn.spring.aop;

/**
 * Created by Acceml on 2016/10/9.
 */
public interface CustomerBo {
    void addCustomer();

    String addCustomerReturnValue();

    void addCustomerThrowException() throws Exception;

    void addCustomerAround(String name);
}
