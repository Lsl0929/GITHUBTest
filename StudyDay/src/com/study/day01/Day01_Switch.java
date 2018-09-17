package com.study.day01;

/**
 * @author 梁世龙
 * @create 2018-09-17 16:00
 *  表达式 支持类型  int,byte,char,short,枚举，字符串
 *  java 5 之后 支持枚举
 * java 7 之后  支持字符串
 * case 表达式 之后 没有 break 会执行剩余的所有case
 *
 */
public class Day01_Switch {
    public static void main(String[] args) {
        int i =1;
        switch (i){
            case 0 :
                System.out.println("0");
                break;
            case 1 :
                System.out.println("1");
                break;//如果这个地方没有break； case 2 会执行  最终输出 1  2
            case 2 :
                System.out.println("2");
                break;
        }

        int a = 3 ;
        int x = 100;
        switch (a){
            case 1:
                x+=5;
                break;
            case 2:
                x+=10;
                break;
            case 3:
                x+=20;
                break;
            case 4:
                x+=30;
                break;

        }
        System.out.println(x);
    }
}
