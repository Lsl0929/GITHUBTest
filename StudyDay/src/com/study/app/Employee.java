package com.study.app;

/**
 * @author 梁世龙
 * @create 2018-11-09 10:40
 */
public abstract class Employee {
    private String name;
    private int number;
    private MyDate birthday;

    abstract int earings();

    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", birthday=" + birthday.toDateString() +
                '}';
    }


}
