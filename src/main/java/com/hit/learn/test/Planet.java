package com.hit.learn.test;

/**
 * Created by Acceml on 2016/11/30.
 */
public enum Planet {
    VENUS(1.0000, 2.333),
    EARTH(1.23, 3.2333);
    private final double mass;
    private final double r;

    Planet(double mass, double r) {
        this.mass = mass;
        this.r = r;
    }

    public double getWeith() {
        return mass * r;
    }
}
