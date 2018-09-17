package com.study.day01;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @author 梁世龙
 * @create 2018-09-17 14:49
 */
public class Day01_If {
    public static void main(String[] args) {
        int age = 12;
        if (age<=12){
            System.out.println("小学生");
        }else if(age<=15){
            System.out.println("初中生");
        }else if(age<=18){
            System.out.println("高中生");
        }else {
            System.out.println("毕业");
        }

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a<=b){
            if(c<=a){
                System.out.println(c+"-"+a+"-"+b);
            }else if(c>=b){
                System.out.println(a+"-"+b+"-"+c);
            }else{
                System.out.println(a+"-"+c+"-"+b);
            }
        }else{
           if (c<=b){
               System.out.println(c+"-"+b+"-"+a);
           }else if(c>=a){
               System.out.println(b+"-"+a+"-"+c);
           }else {
               System.out.println(b+"-"+c+"-"+a);
           }
        }

    }
}
