package com.study.day04;

/**
 * @author 梁世龙
 * @create 2018-11-09 10:06
 * fianl关键字
 * 可以修饰声明类 、属性 和方法
 */
public class TestFinal {
    public static void main(String[] args) {
        final int a =1;
        //fianl修饰的变量及为常量，只能赋值一次，或者在构造方法中初始化，然后才能使用
        //final修饰的方法，子类不能重写。增加安全性。
        //final修饰的类不能被继承。提高安全性，提高程序的可读性
    }
}
