package com.study.day05;

import java.io.FileInputStream;
import java.io.InputStream;


/**
 * @author 梁世龙
 * @create 2018-11-28 10:07
 *
 * throws关键字
 * throws 方法抛出的异常可以是方法中出现的异常类型或其父类类型
 * throws 可以声明抛出多个异常，多个异常使用，分割
 * 运行时异常不需要使用throws关键字进行显示的抛出
 * 重写方法不能抛出比被重写方法范围更大的异常类型
 */
public class StudayException {

    /**
     * ERROR:JVM系统内部错误、资源耗尽等严重情况
     * EXCEPTION:其他因编程错误或偶然的外在因素导致的一般性问题，例如：-空指针 -网络中断
     */

    public static void main(String[] args) {
        //运行时异常
        try {
            int i =10;
            int j = i/0;
        }catch (AbstractMethodError e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally");//finally是可选的  不管在try catch代码块中是否发生异常，finally块中的语句都会执行
        }

        //编译时异常
     //   InputStream inputStream = new FileInputStream("abc.txt");

    }
}
