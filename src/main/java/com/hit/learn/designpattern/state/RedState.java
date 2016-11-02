package com.hit.learn.designpattern.state;

/**
 * Created by Acceml on 2016/11/1.
 */
public class RedState extends State {
    private double serviceFee;

    public RedState(State state) {
        this.balance = state.getBalance();
        this.account = state.getAccount();
        initialize();
    }

    /** 模拟初始化基础数据*/
    private void initialize() {
        interest = 0.0;
        lowerLimit = -100.0;
        upperLimit = 0.0;
        serviceFee = 15.00;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        stateChangeCheck();
    }

    @Override
    public void withdraw(double amount) {
        amount = amount - serviceFee;
        System.out.println("No funds available for withdrawal!");
    }

    @Override
    public void payInterest() {
        // No interest is paid
    }

    /** 状态检测 */
    private void stateChangeCheck() {
        if (balance > upperLimit) {
            account.setState(new SliverState(this));
        }
    }
}
