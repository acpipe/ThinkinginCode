package com.hit.learn.thinkinginjava.innerclass.usethisandnew;

/**
 * Created by Acceml on 2016/3/23.
 * Email: huminghit@gmail.com
 */
class DotNew {
    public class Inner {
    }

    public static void main(String[] args) {
        DotNew dotNew = new DotNew();
        DotNew.Inner inner = dotNew.new Inner();
    }
}
