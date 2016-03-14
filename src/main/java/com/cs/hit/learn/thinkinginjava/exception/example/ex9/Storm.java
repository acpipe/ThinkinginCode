package com.cs.hit.learn.thinkinginjava.exception.example.ex9;

/**
 * Created by Acceml on 2016/1/17.
 */
public interface Storm {
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
}
