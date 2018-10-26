package com.study.app;

/**
 * @author 梁世龙
 * @create 2018-10-25 16:36
 */
public class Cylinder extends Circle{
    private double length;
    public Cylinder(){
        this.length=1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume(){
        return findArea()*length;
    }
}
