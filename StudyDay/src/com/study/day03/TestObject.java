package com.study.day03;

import com.study.app.MyDate;

/**
 * @author 梁世龙
 * @create 2018-11-08 10:02
 * Object 类
 */
public class TestObject {
    public static void main(String[] args) {
        Man man = new Man();
        Man man1 = new Man();
        //==比较两个对象是否指向同一个对象，即是否指向同一内存空间。
        System.out.println(man==man1);//返回false
        //equals()是Object类的方法，由于所有类都继承Object，也就继承了equals().
        //只能比较引用类型，比较是否指向同一对象。 可以比较任意两个对象
        //对于封装类，String，Date,File等已经重写了其equals方法，可以通过equals方法来判定其内容是否相等
        System.out.println(man.equals(man1));
        //比较两个字符串内容是否相同，一定要使用equals方法而不能使用==

        MyDate myDate = new MyDate(2,2,2018);
        MyDate myDate1 = new MyDate(2,2,2018);

        System.out.println(myDate==myDate1);
        System.out.println(myDate.equals(myDate1));
    }
}
