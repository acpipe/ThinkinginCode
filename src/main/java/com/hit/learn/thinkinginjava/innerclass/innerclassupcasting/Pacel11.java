package com.hit.learn.thinkinginjava.innerclass.innerclassupcasting;

/**
 * Created by Acceml on 2016/3/28
 * Email: huminghit@gmail.com
 */
public class Pacel11 {
    private static class ParcelContents implements Contents {
        private int i = 11;

        @Override
        public int valur() {
            return i;
        }
    }

    protected static class ParcelDestinattion implements Destination {
        private String lable;

        public ParcelDestinattion(String lable) {
            this.lable = lable;
        }

        @Override
        public String readTable() {
            return lable;
        }

        public static void f() {
        }

        static int x = 10;

        static class AnotherLevel {
            public static void f() {

            }
            static int x = 10;
        }
    }

    public static Destination destination(String s) {
        return new ParcelDestinattion(s);
    }

    public static Contents contents() {
        return new ParcelContents();
    }

    public static void main(String[] args) {
        Contents c = contents();
        Destination d = destination("huming");
    }
}
