package com.cs.hit.learn.thinkinginjava.exception.example.ex4;

public class ExceptionSpecification {
    public static void main(String[] args) {
        NoExcprion noExcprion = new NoExcprion();
        try {
            noExcprion.f();
            //have to say this
            //since f() have been specified throw exception
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("------");
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
