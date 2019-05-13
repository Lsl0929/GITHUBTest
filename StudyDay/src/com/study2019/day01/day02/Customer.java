package com.study2019.day01.day02;

/**
 * @author 梁世龙
 * @create 2019-05-13 10:02
 * 客户类
 */
public class Customer {
    //属性
    String name;
    int age;

    public void eat(){
        System.out.println("吃饭");
        //方法中可以调用方法
        sleep(20);
    }

    public void  sleep(int hour){
        System.out.println("休息了"+hour+"小时");
    }
}
