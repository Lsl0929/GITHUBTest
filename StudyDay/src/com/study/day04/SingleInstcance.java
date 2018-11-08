package com.study.day04;

/**
 * @author 梁世龙
 * @create 2018-11-08 16:45
 * 单子模式 ：对某个类只能存在一个实例对象
 * 不能通过new关键字的方式创建实例： 构造器私有化
 * 在类的内部创建实例
 * 为了让类的外部能访问到内部创建的实例  该实例必须用static修饰
 * 在类外部 不运行操作内部创建的实例的引用  需要把该属性私有化 private   提供get方法
 */
public class SingleInstcance {

    private int a;

    public int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    //私有化构造器
    private SingleInstcance() {
    }

    //在类的内部创建实例
    private  static SingleInstcance singleInstcance = new SingleInstcance();

    public static SingleInstcance getSingleInstcance() {
        return singleInstcance;
    }

}
