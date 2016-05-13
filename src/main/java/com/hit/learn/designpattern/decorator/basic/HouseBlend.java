package com.hit.learn.designpattern.decorator.basic;

import com.hit.learn.designpattern.decorator.Beverage;

/**
 * Created by Acceml on 2016/5/13
 * Email: huminghit@gmail.com
 */
public class HouseBlend implements Beverage {
    @Override
    public double cost() {
        return 0.01;
    }

    @Override
    public String getDescription() {
        return "HouseBlend";
    }
}
