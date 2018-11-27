package com.nk;

/**
 * @author 梁世龙
 * @create 2018-11-27 15:32
 */
public abstract class MyClass {
    public int constInt =5;
    //constInt= constInt+5;//类中不能直接运算  要在方法中运算就正确

    public abstract void method(int a);
    //public abstract void method(int a){};   有方法体的不能作为抽象函数

    public void method(){

    }
}
