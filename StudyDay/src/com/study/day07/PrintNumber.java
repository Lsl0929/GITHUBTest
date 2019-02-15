package com.study.day07;

/**
 * @author 梁世龙
 * @create 2019-02-14 10:31
 */
public class PrintNumber {
    public static void main(String[] args) {
        Thread thread1 = new NumberThread("线程1");
        Thread thread2 = new NumberThread("线程2");

        thread1.start();
        thread2.start();
    }
}

class NumberThread extends Thread{
    public NumberThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0;i < 100 ;i++){
            System.out.println(getName()+":"+i);
        }
    }
}