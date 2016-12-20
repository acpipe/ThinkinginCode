package com.hit.learn.thinkinginjava.genetic.recursive;

/**
 * Created by Acceml on 2016/11/15.
 */
public class High<T> implements Comparable<T>{
    @Override
    public int compareTo(T o) {
        return 0;
    }
    public static void main(String[] args) {
        High<Man> high = new High<Man>();
        Weight<Man> weight = new Weight();
    }
}
