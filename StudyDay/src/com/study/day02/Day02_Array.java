package com.study.day02;

import java.util.Scanner;

/**
 * @author 梁世龙
 * @create 2018-09-18 9:31
 * 数组属于引用类型
 */
public class Day02_Array {
    public static void main(String[] args) {
        //数组的声明
        int [] a = null;//推荐使用
        int b[] = null;
        //注意 声明数组时不能指定其长度  int [4] a= null;  编译报错
        //为数组分配内存空间
        a = new int[10];  //隐式初始化
        System.out.println(a.length);//10  获取数组长度
        //访问数组中的元素：数组名[数组元素下标]  注意 下标从0开始，所以最大值时length-1，而不是length；
        for (int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }


        /*从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
        成绩>=最高分-10  等级为’A’   成绩>=最高分-20  等级为’B’
        成绩>=最高分-30  等级为’C’   其余     等级为’D’
        提示：先读入学生人数，根据人数创建int数组，存放学生成绩*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入学生人数：");
        int c = scanner.nextInt();//学生人数  相当于数组长度
        int [] s = new int[c];
        int hs = 0;
        for (int i = 0;i<s.length;i++){
            s[i]=scanner.nextInt();
            if(s[i]>hs){
                hs = s[i];
            }
        }

        for (int i =0;i<s.length;i++){
            if(s[i]>= hs -10){
                System.out.println("stundent "+i+"score is "+s[i]+" grade is a");
            }else if(s[i]>= hs -20){
                System.out.println("stundent "+i+"score is "+s[i]+" grade is b");
            }else if(s[i]>= hs -30){
                System.out.println("stundent "+i+"score is "+s[i]+" grade is c");
            }else{
                System.out.println("stundent "+i+"score is "+s[i]+" grade is d");
            }
        }

    }
}
