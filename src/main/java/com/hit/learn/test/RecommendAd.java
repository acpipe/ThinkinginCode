package com.hit.learn.test;

import com.google.common.base.MoreObjects;

/**
 * Created by Acceml on 2016/10/27.
 */
public class RecommendAd {
    private int a;
    private int b;

    public RecommendAd(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("a", a)
                .add("b", b)
                .toString();
    }
}
