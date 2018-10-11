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

        int x =1 ;
        float y =2;
        System.out.println(x/y);
        short a = 128;
        byte b =(byte) a;
        /*byte在内存中占一个字节，范围是 -128到127之间。
        将128强制类型转换为byte型，就超出了byte型的范围，
        128的二进制存储是 1000 0000 转换为byte型后，最高位是符号位，值是-128*/
        System.out.println(isAdmin("Admin"));
    }

    public static boolean isAdmin(String userId){
        //toLowerCase是重新 new String()  ==是比较对象是否是同一对象，所以返回false
        return userId.toLowerCase()=="admin";
    }
}
