package com.hit.learn.test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Acceml on 2016/10/12.
 */
public class Test {

    public static void main(String[] args) {
        Set<String> packageNameSet = new HashSet<String>();
        if(packageNameSet.contains(null)) {
            System.out.println("foo");
        }
        packageNameSet.add(null);
        if(packageNameSet.contains(null)) {
            System.out.println("foo");
        }
    }
}
