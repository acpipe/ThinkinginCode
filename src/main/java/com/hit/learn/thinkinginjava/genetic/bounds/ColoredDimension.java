package com.hit.learn.thinkinginjava.genetic.bounds;

/**
 * Created by Acceml on 2016/3/31
 * Email: huminghit@gmail.com
 */
public class ColoredDimension<T extends Dimension & HasColor> {
    T item;

    public ColoredDimension(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    java.awt.Color color() {
        return item.getColor();
    }

    int getX() {
        return item.x;
    }

    int getY() {
        return item.y;
    }

    int getZ() {
        return item.z;
    }

}
