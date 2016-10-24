package com.hit.learn.spring.anointerface.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Acceml on 2016/10/24.
 */
@Service
public class B {
    @Autowired
    private C c;

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }
}
