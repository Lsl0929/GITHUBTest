package com.study.day02;

/**
 * @author 梁世龙
 * @create 2018-10-10 15:07
 * 测试类
 */
public class TestPerson {
    public static void main(String[] args) {
        //创建一个对象 Person
        //使用 new 关键字
        Person p1 = new Person();
        //为对象属性赋值
        p1.name = "Tom";
        p1.age = 19;
        //调用对象的方法
        System.out.println(p1.add(2,5));
        p1.hello("Jerry");
        p1.shout();

        //匿名对象
        //使用一次就会被系统作为垃圾等待回收  我们通常将匿名对象当作参数传给一个函数来使用
        new Person().shout();

        p1.redius =2;
        System.out.println(p1.findArea());

    }
}
