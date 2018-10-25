package com.nk;

/**
 * @author 梁世龙
 * @create 2018-10-25 14:58
 */
public class MyThead  extends Thread{
    public static void main(String[] args) {
        MyThead t = new MyThead();
        t.start();
        System.out.println("one");
        MyThead s  = new MyThead();
        s.start();
        System.out.println("two");
    }

   public  void run(){
       System.out.println("Thread");
   }
}
