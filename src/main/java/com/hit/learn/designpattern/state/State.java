package com.hit.learn.designpattern.state;

/**
 * Created by Acceml on 2016/11/1.
 */
public abstract class State {
    protected Account account;
    protected double balance;
    protected double interest;
    protected double lowerLimit;
    protected double upperLimit;
    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    //------------------------------------------//

    /**存入金额*/
    public abstract void deposit(double amount);
    /**支出金额*/
    public abstract void withdraw(double amount);
    /**利息*/
    public abstract void payInterest();
}
