package com.study.day06;

/**
 * @author 梁世龙
 * @create 2019-01-23 11:04
 * 一个类的对象是有限且固定的，如季节类，只能有4个对象
 * 手动实现枚举
 * -private修饰构造器
 * -属性使用private final 修饰
 * -把该类的所有实例都使用public static final 来修饰
 */
public enum TestEnum {
  //1。必须在枚举类的第一行写出有哪些枚举值
    SPRING,SUMER,FALL,WINTER;

    private TestEnum() {
    }
}
