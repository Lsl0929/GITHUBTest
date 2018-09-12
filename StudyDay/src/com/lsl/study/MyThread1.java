package com.lsl.study;

/**
 * @author 梁世龙
 * @create 2018-09-12 15:28
 */
public class MyThread1 extends Thread{
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        myThread1.setName("自定义线程1");
        myThread1.start();
        System.out.println(Thread.currentThread().toString());
    }
}
