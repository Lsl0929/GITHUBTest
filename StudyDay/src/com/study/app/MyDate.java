package com.study.app;

/**
 * @author 梁世龙
 * @create 2018-11-08 10:32
 */
public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int day, int month, int year) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof MyDate)){
            return false;
        }
        MyDate myDate = (MyDate) obj;
        return this.year == myDate.year && this.month==myDate.month && this.day  == myDate.day;
    }
}
