package com.study.day05;

/**
 * @author 梁世龙
 * @create 2018-11-28 11:16
 *
 * 人工手动抛出异常
 */
public class TestThrow {
    public static void main(String[] args) {

    }
    public static void test(){
        //创建一个异常类对象
        RuntimeException ex = new RuntimeException();
        //把异常类对象抛出
        throw  ex;
    }
}
