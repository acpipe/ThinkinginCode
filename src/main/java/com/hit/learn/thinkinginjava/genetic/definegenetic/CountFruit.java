package com.hit.learn.thinkinginjava.genetic.definegenetic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Acceml on 2016/3/30
 * Email: huminghit@gmail.com
 */
class CountFruit<T> {
    List<T> fruit;
    public void addAll1(List<?> fruitList) {

    }

    public void addAll2(List<? extends T> fruitList) {
        for(T tmp:fruitList) {
            fruit.add(tmp);
        }
    }
    public void addAll3(List<T> fruitList) {
        for(T tmp:fruitList) {
            fruit.add(tmp);
        }
    }

    public static void main(String [] args) {
        CountFruit<Apple> appleCountFruit=new CountFruit<>();
        List<Apple> l=new ArrayList<>();
        List<SubApple> l2=new ArrayList<>();
        appleCountFruit.addAll1(l2);
        appleCountFruit.addAll2(l2);
       // appleCountFruit.addAll3(l2);
    }
}

