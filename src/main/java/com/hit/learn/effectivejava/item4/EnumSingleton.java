package com.hit.learn.effectivejava.item4;

import java.io.Serializable;


public enum EnumSingleton implements Serializable {
    INSTANCE;
    public void readBook() {
        System.out.println("hello");
    }
    public static void main(String [] args ) {
        EnumSingleton singleton=EnumSingleton.INSTANCE;
        singleton.readBook();
    }
}
