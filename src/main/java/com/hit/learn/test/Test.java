package com.hit.learn.test;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Acceml on 2016/10/12.
 */
public class Test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Iterator<String> iterator = list.listIterator();
        if(iterator == null) {
            System.out.println("foo");
        }
    }
}
