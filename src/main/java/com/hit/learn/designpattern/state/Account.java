package com.hit.learn.designpattern.state;

/**
 * Created by Acceml on 2016/11/1.
 */
public class Account {
    private State state;
    private String owner;
    public Account(String owner){
        // 新开账户默认为 Silver状态
        this.owner = owner;
        this.state = new SliverState(0.0, this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void deposit(double amount) {
        state.deposit(amount);
        System.out.println(owner + " Deposited  " + amount);
        System.out.println(owner + " Balance =  " + state.getBalance());
        System.out.println("Status = " + state.getClass().getSimpleName());
        System.out.println("==============================================");
    }

    public void withdraw(double amount){
        state.withdraw(amount);
        System.out.println(owner + " Withdrew  " + amount);
        System.out.println(owner + " Balance =  " + state.getBalance());
        System.out.println("Status = " + state.getClass().getSimpleName());
        System.out.println("==============================================");
    }

    public void payInterest(){
        state.payInterest();
        System.out.println(owner + " Interest Paid  ");
        System.out.println(owner + " Balance =  " + state.getBalance());
        System.out.println("Status = " + state.getClass().getSimpleName());
        System.out.println("==============================================");
    }

    public static void main(String[] args) {
        // 新开一个银行账户
        Account account = new Account("Andy.Chen");

        // 存取款等系列操作
        account.deposit(500.0);
        account.deposit(300.0);
        account.deposit(550.0);
        account.payInterest();
        account.withdraw(2000.00);
        account.withdraw(1100.00);
    }

}
