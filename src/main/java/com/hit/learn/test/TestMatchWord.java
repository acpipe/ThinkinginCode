package com.hit.learn.test;

import io.netty.handler.codec.base64.Base64;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Acceml on 2016/11/3.
 */
public class TestMatchWord {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("100", "0");
        System.out.println(Long.valueOf(map.get("100")));
    }
}
