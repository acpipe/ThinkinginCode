package com.hit.learn.designpattern.state;

/**
 * Created by Acceml on 2016/11/1.
 */
public class SliverState extends State {

    public SliverState(State state) {
        this(state.balance, state.account);
    }

    public SliverState(double balance, Account account) {
        this.balance = balance;
        this.account = account;
        initialize();
    }

    /**
     * 模拟初始化基础数据
     */
    private void initialize() {
        interest = 0.0;
        lowerLimit = 0.0;
        upperLimit = 1000.0;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        stateChangeCheck();
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
        stateChangeCheck();
    }

    @Override
    public void payInterest() {
        balance += interest * balance;
        stateChangeCheck();
    }

    /**
     * 状态检测
     */
    private void stateChangeCheck() {
        if (balance < lowerLimit) {
            account.setState(new RedState(this));
        } else if (balance > upperLimit) {
            account.setState(new GoldState(this));
        }
    }
}
