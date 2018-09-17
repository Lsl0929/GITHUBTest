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



    }
}
