package com.study.app;

/**
 * @author 梁世龙
 * @create 2018-10-25 15:45
 */
public class Circle {

    private double radius;

    public double findArea(){
        return Math.PI*radius*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
