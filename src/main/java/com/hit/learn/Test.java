package com.hit.learn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Acceml on 2016/10/12.
 */
public class Test {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        if(map.get("huming") == null) {
            System.out.println("foo");
        }
        List<String> a = new ArrayList<>();
        a.add("huming");
        List<String> b=null;
        a.addAll(b);
        System.out.println(a);
    }
}
