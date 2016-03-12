package com.cs.hit.learn.thinkinginjava.exception.example.ex3;

public class FullConstruct {
    public static void f() throws MyException {
        System.out.println("Exception from f()");
        throw new MyException();
    }


    public static void g(String msg) throws MyException {
        System.out.println("Exception from g()");
        throw new MyException(msg);
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace();
        }
//        is any diff ?
//        System.out print into console
        try {
            g("hello");
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
