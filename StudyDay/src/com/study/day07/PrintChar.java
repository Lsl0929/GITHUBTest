package com.study.day07;

/**
 * @author 梁世龙
 * @create 2019-02-15 10:08
 */
public class PrintChar implements Runnable{

    public static void main(String[] args) {
        PrintChar printChar = new PrintChar();
        Thread th1 = new Thread(printChar);
        Thread th2 = new Thread(printChar);

        th1.setName("x: ");
        th2.setName("xx: ");

        th1.start();
        th2.start();
    }


    private char c = 'a';

    public synchronized boolean  printChar(){
        try {
            Thread.sleep(1111);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (c <= 'z'){
            System.out.println(Thread.currentThread().getName()+c);
            c++;
            return true;
        }

        return  false;
    }



    @Override
    public void run() {
        boolean flag = printChar();
        while (flag){
            flag=printChar();
        }
    }
}
