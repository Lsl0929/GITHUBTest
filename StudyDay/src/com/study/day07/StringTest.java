package com.study.day07;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;

/**
 * @author 梁世龙
 * @create 2019-01-29 15:53
 * 1.String 是不可变的字符序列！
 * 2.关于字符串缓冲池  直接通过 = 为字符串赋值，会在缓冲池中查找有没有相同的字符串，
 * 如果有会把对应的字符串的引用赋值给字符串变量，没有会新建一个，并且放入到缓冲池中
 * 3.字符串常用方法
 *  equals():比较字符串内容是否相等必须使用该方法，而不能直接使用==
 */
public class StringTest {


    @Test
    public void testTransfor(){
        //要求：输出给定字符串中英文字母，后移一位
        String str = "adasdas-azsdasd#asdasdffZgg";
        System.out.println(str);
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch>='a'&& ch<='z'){
                if(ch=='z'){
                    ch='a';
                }else{
                    ch = (char)(ch+1);
                }

            }else if(ch>='A'&& ch<='Z'){
                if(ch=='Z'){
                    ch = 'A';
                }else{
                    ch = (char)(ch+1);
                }

            }
            System.out.print(ch);
        }
    }

    @Test
    public void testNewString(){
        String str1 = "123";
        String str2 = "123";
        System.out.println(str1 == str2);//true
        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());//哈希码相同
        System.out.println(str2.hashCode());

        String str3 = new String("2222");
        String str4 = new String("2222");
        System.out.println(str3 == str4);//false

    }

    @Test
    public void test(){
        String str = "www.baidu.com";
        String result = str.replace("om","n");
        str = str.replace("om","n");//把新的值赋给str  老的str被回收
        System.out.println(result);

        Person p1 = new Person("aaa",12);
        System.out.println(p1);
        changPerson(p1);
        System.out.println(p1);
        changeStr(str);
        System.out.println(str);
    }

    public void changPerson(Person person){
        person.setName("atguigu");
    }

    public void changeStr(String str){
        str.replace("a","b");
    }
}

