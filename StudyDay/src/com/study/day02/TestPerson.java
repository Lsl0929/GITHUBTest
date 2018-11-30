package com.study.day02;

import com.study.day03.Man;
import com.study.day03.Woman;

import java.io.BufferedReader;

/**
 * @author 梁世龙
 * @create 2018-10-10 15:07
 * 测试类
 */
public class TestPerson {
    public static void main(String[] args) {
        //创建一个对象 Person
        //使用 new 关键字
        //创建对象一定是调用了类的某一个构造器
        //类中没有显示的定义构造器，则将调用默认的那个构造器
        Person p1 = new Person();
        //为对象属性赋值
        p1.name = "Tom";
        System.out.println(p1.age);
        p1.age = 19;
        System.out.println(p1.age);
        //调用对象的方法
        System.out.println(p1.add(2,5));
        p1.hello("Jerry");
        p1.shout();

        //匿名对象
        //使用一次就会被系统作为垃圾等待回收  我们通常将匿名对象当作参数传给一个函数来使用
        new Person().shout();

        p1.setRedius(3);
        System.out.println(p1.findArea());

        Person p3 = new Person("Tam",66);
        System.out.println(p3.name+"😍"+p3.age);
        System.out.println(p1.equals(p3));


        //多态
        // 1.子类对象可以替代父类的使用 ，父类的引用可以指向子类的对象
        // 2.发布方法调用是在运行时确定的，所以调用的是Student类的getInfo()方法。--动态绑定
        // 3.在存在父子关系（多态）的情况下，可以把父类的引用类型强制转换为子类的引用类型。
        // 不能转换的情况下 会抛出java.lang.ClassCastException
        // 在转换之前判断对象实际上是否为指定的子类类型 使用 instanceof 运算符。必须要求前面的指向的变量和后边的类之间存在父子关系


        //首先创建一个Man的实列
        Man m1 = new Man();
        Woman w1 = new Woman();
        Person p4 = new Person();

        //多态的方式  需要一个人来了一个男人  合法    因为男人一定是一个人
        Person p5 = new Man();
        //在多态情况下，可以进行强制类型转换
        Man m2 = (Man) p5;
        System.out.println(p5 instanceof Man);

       // Man m2 = new Person();  错误的表现方式  需要一个男人  来了一个人  不合法因为人不一定是男人

    }

}
