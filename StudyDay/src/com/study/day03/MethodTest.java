package com.study.day03;

/**
 * @author 梁世龙
 * @create 2018-10-19 16:22
 */
public class MethodTest {
    public static void main(String[] args) {
        MethodOverload mo = new MethodOverload();
        mo.mOL(1);
        mo.mOL(2,3);
        mo.mOL("adv");

        System.out.println(mo.max(1,3));
        System.out.println(mo.max(1.3,3.3));
        System.out.println(mo.max(1,7,5));
    }
}
