package com.study.app;

/**
 * @author 梁世龙
 * @create 2018-11-09 10:43
 */
public class SalarieEmployee extends Employee{
    private int weeklySalary;

    public SalarieEmployee(String name, int number, MyDate birthday, int weeklySalary) {
        super(name, number, birthday);
        this.weeklySalary = weeklySalary;
    }

    @Override
    int earings() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return "SalarieEmployee{" + super.toString() +
                '}';
    }
}
