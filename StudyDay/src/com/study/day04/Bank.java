package com.study.day04;

/**
 * @author 梁世龙
 * @create 2018-11-08 15:34
 */
public class Bank {
    private String id;
    private static int initId=10;
    private String password;
    private double balance;
    public static double rate;
    public static double minBalance;


    public Bank(String password, double balance) {
        this.id = ""+(initId++);
        this.password = password;
        this.balance = balance;
    }


    //非静态代码块：先于构造器执行，每创建一次对象会执行一次
    {
        System.out.println("非静态代码块");
    }
    //优先于非静态代码块，在类被加载时执行一次，且只执行一次，可以在此对静态成员初始化
    static {
        System.out.println("静态代码块");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +'\'' +
                ", rate=" + rate +'\'' +
                ", minBalance=" + minBalance +
                '}';
    }
}
