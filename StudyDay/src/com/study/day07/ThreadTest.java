package com.study.day07;

/**
 * @author 梁世龙
 * @create 2019-02-14 10:07
 * 多线程
 */
public class ThreadTest {
    public static void main(String[] args) {
        //1.创建线程对象
        Thread thread = new FirstThread("FirstThread");
        //2.调用线程对象的start()方法启动线程
        thread.start();
        String threadName = Thread.currentThread().getName();
        for (int i =0;i<100;i++){
            System.out.println(threadName+":"+i);
        }
    }
}

class FirstThread extends Thread{
    public FirstThread(String firstThread) {
        super(firstThread);
    }

    /**
     *线程体在run方法中
     *
     */
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        for (int i =0;i<100;i++){
            System.out.println(threadName+":"+i);
        }
    }
}
