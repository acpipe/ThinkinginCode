package com.hit.learn.thinkinginjava.exception.example.ex9;

/**
 * Created by Acceml on 2016/1/17.
 */
public abstract class Inning {
    public Inning() throws BaseballException {}
    public void event() throws BaseballException {

    }
    public abstract void atBat() throws Strike,Foul;
    public void walk() throws Exception{}
}
