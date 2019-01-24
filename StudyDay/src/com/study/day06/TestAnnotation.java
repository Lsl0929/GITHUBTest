package com.study.day06;

/**
 * @author 梁世龙
 * @create 2019-01-24 15:57
 */
public class TestAnnotation {
    public static void main(String[] args) {
            A a = new A();
            a.method2();

            @SuppressWarnings(value = "abc")
            String str = "abc";
    }
}

class  A {
    void method1(){}

    //表名改方法过期，不建议使用
    @Deprecated
    void method2(){

    }
}

class B extends A{
    //限定这个方法必须是重写父类方法的注解
    @Override
    void method1(){}
}
