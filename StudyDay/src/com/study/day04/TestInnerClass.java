package com.study.day04;

/**
 * @author 梁世龙
 * @create 2018-11-09 16:09
 */
public class TestInnerClass {

    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        //创建内部类的实例
        OutClass.InnerClass innerClass = outClass.new InnerClass();
        //静态内部类创建实例
        OutClass.StaticClass SC = new OutClass.StaticClass();

        innerClass.test();
    }


}
