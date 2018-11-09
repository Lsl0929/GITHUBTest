package com.study.app;

/**
 * @author 梁世龙
 * @create 2018-11-09 10:49
 */
public class HourlyEmployee extends Employee{

    private int wage;
    private int hour;


    public HourlyEmployee(String name, int number, MyDate birthday, int wage, int hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    int earings() {
        return wage*hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +super.toString()+"}";
    }
}
