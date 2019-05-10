package com.study2019.day01.day02;

/**
 * @author 梁世龙
 * @create 2019-05-09 14:27
 * 类
 * 成员：属性、方法
 * 属性：成员变量 filed
 *
 * 成员变量  vs 局部变量
 *
 * 相同点：  1.定义的格式 数据类型  变量名  = 变量值
 *          2.先声明后使用
 *          3.变量都有其对应的作用域
 *
 * 不同点： 1.成员变量：在类中{} 直接声明的变量为成员变量，
 *           局部变量： 在方法内声明、方法形参、代码块内、构造器形参、构造器内部的变量
 *         2.权限修饰符  成员变量：可以在声明属性时，指明其权限，使用权限修饰符。
 *                      局部变量：不能使用权限修饰符
 *
 *
 * 方法：成员方法  method
 */
public class Person {

    //属性  成员变量
    private String name;
    private int age;

    //方法
    public void eat(){
        System.out.println("吃饭");
    }
    public void talk(String language){
        //language  局部变量
        int a = 1; //局部变量
        System.out.println("使用的语言："+language);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
