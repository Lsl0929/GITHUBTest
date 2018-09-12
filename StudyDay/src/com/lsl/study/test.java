package com.lsl.study;

/**
 * @author 梁世龙
 * @create 2018-09-12 15:09
 */
public class test {
    static {
        int x =5;
    }
    static int x,y;

    public static void main(String[] args) {
        x--;
        myMethod();
        System.out.println(x+y + ++x);
    }
    public static void myMethod(){
        y= x++ + ++x;
    }
    /**
     *
     */

}
