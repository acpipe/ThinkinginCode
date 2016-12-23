package com.hit.learn.test;

import com.google.common.base.MoreObjects;

/**
 * Created by Acceml on 2016/12/6.
 */
public class Test2 {
    private String a = "huming";
    private String b = "hello";
    private String c = "foo";

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("a", a)
                .add("b", b)
                .add("c", c)
                .toString();
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        System.out.println(test2.toString());
    }
}
