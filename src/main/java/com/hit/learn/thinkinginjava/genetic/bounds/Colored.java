package com.hit.learn.thinkinginjava.genetic.bounds;

/**
 * Created by Acceml on 2016/3/31
 * Email: huminghit@gmail.com
 */
class Colored<T extends HasColor> {
    T item;

    public Colored(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    java.awt.Color color() {
        return item.getColor();
    }
}
