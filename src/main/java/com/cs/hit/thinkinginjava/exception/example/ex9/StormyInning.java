package com.cs.hit.thinkinginjava.exception.example.ex9;

/**
 * Created by Acceml on 2016/1/17.
 */
public class StormyInning extends Inning implements Storm {
    public StormyInning() throws BaseballException ,RainedOut {
    }
    public StormyInning(String s) throws BaseballException,Foul{

    }
    @Override
    public void event() {
    }

    @Override
    public void atBat() throws PopFoul {

    }

    @Override
    public void walk() {
    }

    @Override
    public void rainHard() throws RainedOut {

    }
    public static void main(String [] args) {

    }
}

