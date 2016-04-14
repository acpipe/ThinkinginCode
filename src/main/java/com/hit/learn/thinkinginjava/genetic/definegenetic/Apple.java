package com.hit.learn.thinkinginjava.genetic.definegenetic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Acceml on 2016/3/30
 * Email: huminghit@gmail.com
 */
class Apple<T> {
    private List<T> tList;
    public Apple(List<?> tList) {
        this.tList = (List<T>) tList;
    }
    public void show() {
        for (T tmp : tList) {
            System.out.println(tmp);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Apple<Object> integerApple= new Apple<Object>(list);
    }

}
