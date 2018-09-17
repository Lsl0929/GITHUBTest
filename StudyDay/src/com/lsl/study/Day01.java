package com.lsl.study;

/**
 * @author 梁世龙
 * @create 2018-09-10 14:15
 */
public class Day01 {
    public static void main(String[] args) {
        String str = "hello";
        String str1 = "hel"+new String("lo");
        System.out.println(str==str1);
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1==n2);
        System.out.println(",");
        System.out.println(n1!=n2);//类的加载包括：加载，验证，准备，解析，初始化。
        float f = 12.23F;
        char c3 = '\u0061';
        System.out.println(c3);
        System.out.println(c3+1);
        System.out.println((char)(c3+1));
    }
}
