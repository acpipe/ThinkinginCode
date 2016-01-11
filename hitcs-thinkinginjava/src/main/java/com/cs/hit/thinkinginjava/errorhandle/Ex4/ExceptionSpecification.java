package com.cs.hit.thinkinginjava.errorhandle.Ex4;

public class ExceptionSpecification {
    public static void main(String[] args) {
        NoExcprion noExcprion = new NoExcprion();
        try {
            noExcprion.f();
            //have to say this
            //since f() have been specified throw exception
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
