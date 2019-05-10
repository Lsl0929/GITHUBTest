package com.study2019.day01.day02;

/**
 * @author 梁世龙
 * @create 2019-05-09 10:08
 * Java 面向对象学习
 * 1.Java类及类的成员：属性、方法、构造器；代码块、内部类
 *
 * 2.面向对象的三大特征：封装性、多态性、继承性
 *
 * 3.关键字
 *
 * 类和对象
 * 类：对一类事物的描述，是抽象的、概念上的定义
 * 对象：是实际存在的该类事物的每个个体，因而也称为实力（instance）
 * 万事万物皆对象
 */
public class OOPTest {
    public static void main(String[] args) {

        //类和对象的使用  面向对象思想落地的实现
        Person p = new Person();
        p.eat();
        p.talk("zh");

        p.setAge(18);//给属性赋值 调用属性
        p.setName("Tom");
        System.out.println(p.getName()+"\t"+p.getAge());


        Person p1 = new Person();
        System.out.println(p1.getName());//值为null

        //赋值 将p变量保存的对象地址赋值给p2，导致p和p2指向了堆空间中的同一个实体对象
        Person p2 = p;
        System.out.println(p2.getName());//Tom
    }
}
