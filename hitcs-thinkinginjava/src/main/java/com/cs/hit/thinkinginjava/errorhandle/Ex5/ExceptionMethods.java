package com.cs.hit.thinkinginjava.errorhandle.Ex5;

/**
 * Created by Acceml on 2016/1/11.
 */
public class ExceptionMethods {
    public static void main(String[] args) {
        try {
            throw new Exception("my exception");
        } catch (Exception e) {
            System.out.println("getMsg():" + e.getMessage());
            System.out.println("getLocalizedMessage()" + e.getLocalizedMessage());
            System.out.println("toString" + e);
            System.out.println("printStackTrace");
            e.printStackTrace(System.err);
            System.out.println("fillInStackTrace()" + e.fillInStackTrace());
            System.out.println(e.getClass().getName());
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
