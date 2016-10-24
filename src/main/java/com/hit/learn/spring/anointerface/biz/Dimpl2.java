package com.hit.learn.spring.anointerface.biz;

import org.springframework.stereotype.Service;

/**
 * Created by Acceml on 2016/10/24.
 */
@Service
public class Dimpl2 implements D {
    private String value;

    @Override
    public String getValue() {
        return "Dimpl2";
    }
}
