package com.study.day02;

/**
 * @author 梁世龙
 * @create 2018-10-10 14:53
 * 关键字 class
 * 使用class关键字定义了一个类 ：Person
 */
public class Person {
    //定义类的属性 ：  类型  属性名
    String name;
    //类型 属性名 = 初始值
    int age =24;
    //定义类方法
    //带返回参数的  : 返回值类型 方法名()
    int getAge(){
        return age;
    }

    //不带返回值的  return 表示方法结束，后面不能再有其他语句。
    void shout(){
        System.out.println("I am" + name);
        return;
    }

    //带参数 无返回值
    void hello(String personName){
        System.out.println(personName);
    }

    //带参数 有返回值
    int add(int i,int j){
        return  i+j;
    }

}
