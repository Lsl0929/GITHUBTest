package com.study2019.day01;

/**
 * @author Lsl
 * @date 2019/4/18
 * 基本数据类型之间的运算
 *
 * 自动类型提升
 * 当容量小的数据类型与容量大的数据类型做运算时，结果自动提升为容量大的数据类型
 * byte-->short、char-->int-->long-->flaot-->double
 * byte、char、short三种变量的类型做运算时，结果为int型、
 *
 * 强制类型转换 ：自动类型提升的逆运算
 *
 *
 */
public class Day02_operation {

    public static void main(String[] args) {
        byte b1 = 2;
        int i1 =3;
        int i2 = b1+i1;
        System.out.println(i2);
        char c1 ='a';//97
        int i3 = c1+i2;
        System.out.println(i3);

        double d1 = 12.9;
        int i4 = (int)d1;//截断操作，可能导致精度损失
        System.out.println(i4);
    }
}
