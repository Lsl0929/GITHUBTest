package com.lsl.study;

/**
 * @author 梁世龙
 * @create 2018-09-12 15:23
 */
public class MyThread implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

}
