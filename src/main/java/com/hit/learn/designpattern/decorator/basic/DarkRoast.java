package com.hit.learn.designpattern.decorator.basic;

import com.hit.learn.designpattern.decorator.Beverage;

/**
 * Created by Acceml on 2016/5/13
 * Email: huminghit@gmail.com
 */
public class DarkRoast implements Beverage {
    @Override
    public String getDescription() {
        return "DarkRoast";
    }

    @Override
    public double cost() {
        return 0.02;
    }
}
