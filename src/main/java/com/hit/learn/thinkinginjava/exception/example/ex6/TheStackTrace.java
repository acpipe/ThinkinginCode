package com.hit.learn.thinkinginjava.exception.example.ex6;

/**
 *  Created by Acceml on 2016/1/11.
 */
public class TheStackTrace {
    public static void f() {
        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement tmp : e.getStackTrace()) {
                System.out.println(tmp);
            }
        }
    }

    public static void g() {
        f();
    }

    public static void h() {
        g();
    }

    public static void main(String[] args) {
        System.out.println("------------------");
        f();
        System.out.println("------------------");
        g();
        System.out.println("------------------");
        h();
    }
}
