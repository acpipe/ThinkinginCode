package com.hit.learn.thinkinginjava.exception.example.ex8;

public class AlwaysFinally {
    public static void main(String[] args) {
        try {
            System.out.println("2");
            try {
                throw new FourException();
            } finally {
                System.out.println("3");
            }
        }catch (FourException e) {
            System.out.println("4");
        }finally {
            System.out.println("5");
        }
    }
}
//2,3,4,5  not 2,4,3,5
