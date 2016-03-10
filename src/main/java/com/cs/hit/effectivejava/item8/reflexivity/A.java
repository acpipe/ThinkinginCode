package com.cs.hit.effectivejava.item8.reflexivity;

import java.util.ArrayList;
import java.util.Collection;

public class A {
    public static void main(String [] args) {
        Collection <B> collection=new ArrayList<B>();
        B b=new B();
        collection.add(b);
        if(collection.contains(b)) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
