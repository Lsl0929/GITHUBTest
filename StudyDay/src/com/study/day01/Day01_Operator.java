package com.study.day01;

/**
 * @author 梁世龙
 * @create 2018-09-17 10:23
 * 运算符
 */
public class Day01_Operator {
    public static void main(String[] args) {
        //取模  通常用于判断一个数是否为一个数的整数倍
        int r = 10%3;
        System.out.println(r);
        //自增
        int i = 10;
        //i++  加号在后面  先取值，在运算   先去i的值  再去运算  先把i的值赋给j 在取运算i++
        int j = i++;
        System.out.println(j);
        j=i;
        System.out.println(j);

        int m = 100;
        //++m，先运算，后取值，先运算++m，值为101，在赋值给n
        int n = ++m;
        System.out.println(n);
        n=m;
        System.out.println(n);
        //总结：++ 运算符在前便，优先运算，运算符在后边，先取值在运算
        //+：字符串相加
        System.out.println("abc"+"123");
        //被除数为负数，进行取模运算时，负号可以忽略不记
        System.out.println(10%-3);// 1
        //先进行绝对值取模运算，在加上负号
        System.out.println(-10%5);// -1

        int x = 3510;
        //x的结果为3000   整数相除，会忽略小数点后的位数只保留整数位 x/1000 = 3  在乘以1000 结果为3000
        x=x/1000*1000;

        //+ 除了把字符串相加，还能把非字符串转成字符串
        System.out.println("5+5="+5+5);

        //扩展赋值运算符： +=, -=, *=, /=, %=
        x += 1000;
        System.out.println(x); // x = x+1000; 4000

        //^ 异或 当且仅当两边的表达式的结果为不同时结果为true 否则为false
        int  a = 10;
        int  b = 25;
        System.out.println(a>5 ^ b<30);//false
        System.out.println(a>15 ^ b<30);//true
        System.out.println(a>5 ^ b<20);//true

        //短路逻辑运算符 ： && ||
        System.out.println(a>15 & b<30);//单个&运算符  前后两个都要运算
        System.out.println(a>15 && b<30);//短路逻辑运算符  前边的表达式已经可以确定整个表达式的值，则不在计算后边的值

        //位移运算符
        int c = 3;// 0000 0011
        System.out.println(c << 2);// 0000 1100  = 12  左移
        System.out.println(c >> 2);//右移 0  无符号右移 >>>

        //三元运算符  条件表达式？表达式1 ：表达式2  条件为true 结果为表达式1 否则取表达式2
        System.out.println(c==4?"1":"2");


    }
}
