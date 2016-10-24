package com.hit.learn.test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Acceml on 2016/10/12.
 */
public class Test {
    public static Set union(Set s1, Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

    public static void main(String[] args) {

    }
}
