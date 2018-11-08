package com.study.day03;

/**
 * @author 梁世龙
 * @create 2018-11-08 10:44
 * toSting
 */
public class TestToString {
    public static void main(String[] args) {
        /**
         * toString():
         * Object 类定义的方法，所以任何对象都可以来调用toString()方法
         * 默认情况下，toString()方法 全类名@hash码
         * 可以根据需求重写toString(),通常用于测试，个别时候用于显示
         *
         */
        //null可以被强制类型转换成任意类型（不是任意类型对象），于是可以通过它来执行静态方法。
        ((TestToString)null).testMethod();

        String s =null;
        System.out.println((s==null)||(s.length()==0));
    }

    private static void testMethod(){
        System.out.println("testMethod");
    }
}
