package com.study.day02;

import java.util.Scanner;

/**
 * @author 梁世龙
 * @create 2018-09-17 17:06
 *
 * break只能用于switch语句和循环语句中
 * continue 只能用于循环语句中。
 * 标号语句必须紧接在循环的头部。标号语句不能用在非循环语句的前面。
 * break和continue之后不能有其他的语句，因为程序永远不会执行break 和 continue之后的语句。
 */
public class Day02_While {
    public static void main(String[] args) {
        //求1到100之间所有偶数的和
        int i =1;
        int k =0;
        while (i<=100){
            if(i%2==0){
                k+=i;
            }
            System.out.println(i);
            i++;
        }
        System.out.println(k);

        //先执行do循环体 在判断while条件  do while 一定会执行一次循环体
        int j = 1;
        do {
            System.out.println(j++);
        }while (j<=100);


        //从键盘读入若干数，判断读入数 的整数 和负数  ，输入0结束
        int x =0;//正数个数
        int y =0;//负数个数
         while (true){
             Scanner scanner = new Scanner(System.in);
             int b =scanner.nextInt();

             if(b>0){
                 x++;
             } else if(b<0){
                 y++;
             }else{
                 break;//退出循环
             }
         }
        System.out.println(x);
        System.out.println(y);

        //continue  跳出某个循环的一次执行
        for (int s = 1;s<=100;s++){
            if(s%2 !=0){
                continue;//后边不在执行 结束本次执行
            }
            System.out.println(s);
        }
    }
}
