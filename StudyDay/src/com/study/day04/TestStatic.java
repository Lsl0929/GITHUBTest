package com.study.day04;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

/**
 * @author 梁世龙
 * @create 2018-11-08 15:04
 *
 * static 静态类  可以使用“类名.”直接访问静态成员（属性和方法）
 * static成员也成为 类成员 或 静态成员  类变量由该类的所有实例共享  类属性类似于全局变量
 * static方法内部只能访问类的static属性，不能访问类的非static属性
 * 静态方法不能以任何方式引用this和super关键字  this当前类的实例 super父类实例  静态类没有实例
 * 静态属性初始化 指对类的静态属性初始化
 */
public class TestStatic {
    //String[] args  用于保存java执行命令时传递的参数
    public static void main(String[] args) {
        Bank.rate=0.01;
        Bank.minBalance=100;

        Bank bank = new Bank("1234",100);
        Bank bank1 = new Bank("1234",100);
        Bank bank2 = new Bank("1234",100);

        System.out.println(bank);
        System.out.println(bank1);
        System.out.println(bank2);

        SingleInstcance singleInstcance = SingleInstcance.getSingleInstcance();
        singleInstcance.b=1;
        singleInstcance.getA();
    }
}
