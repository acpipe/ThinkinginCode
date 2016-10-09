package com.hit.learn;

import org.apache.thrift.TException;

/**
 * Created by Acceml on 2016/10/8.
 */
public class CalculatorHandler implements MultiplicationService.Iface {
    @Override
    public int multiply(int n1, int n2) throws TException {
        return n1 + n2;
    }
}
