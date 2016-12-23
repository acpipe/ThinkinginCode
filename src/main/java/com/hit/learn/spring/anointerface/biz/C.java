package com.hit.learn.spring.anointerface.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Acceml on 2016/10/24.
 */
@Service
public class C {
    @Autowired
//    @Qualifier("dimpl2")
    @Qualifier("dimpl1")
    private D d;

    public D getD() {
        return d;
    }

    public void setD(D d) {
        this.d = d;
    }
}
