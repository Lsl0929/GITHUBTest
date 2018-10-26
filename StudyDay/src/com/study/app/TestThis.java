package com.study.app;

/**
 * @author 梁世龙
 * @create 2018-10-23 16:25
 */
public class TestThis {
    public static void main(String[] args) {
        Boy boy = new Boy("TOM");
        Girl girl = new Girl();
        girl.setName("Jerry");
        boy.marry(girl);

        Cylinder c = new Cylinder();
        c.setLength(2);
        System.out.println(c.findArea());
        System.out.println(c.findVolume());
    }
}
