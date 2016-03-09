package com.cs.hit.thinkinginjava.exception.example.ex7;
// throw a new exception
//the root of exception is the method which 'new' the exception
public class RethrowDifferentException {
    public static void f() throws OneException {
        throw new OneException("OneException from f()");
    }

    public static void main(String[] args) {
        try {
            try {
                f();
            } catch (OneException e) {
                e.printStackTrace(System.out);
                throw new TwoException("from inner catch");
            }
        } catch (TwoException e) {
            e.printStackTrace(System.out);
        }
    }
}
