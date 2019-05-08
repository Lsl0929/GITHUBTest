package com.study.day07;

/**
 * @author 梁世龙
 * @create 2019-02-14 16:36
 *
 * 多个线程访问一个共享资源时，会出现线程安全问题
 * 使用synchronized代码块解决线程安全的问题：需要在synchronized代码块中参照共同的一个对象
 */
public class ShareApple implements Runnable{

    private int appleCount =5;

    boolean getApple(){
        synchronized (this){
            if(appleCount >0){
                appleCount--;
                System.out.println(Thread.currentThread().getName()+"拿走了1个苹果，还剩下"+appleCount+"个苹果");
                try {
                    Thread.sleep(1111);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return true;
            }
            return false;
        }
    }

    @Override
    public void run() {
        boolean flag = getApple();
        while (flag){
            flag=getApple();
        }
        System.out.println(Thread.currentThread().getName()+"结束进程");
    }


    public static void main(String[] args) {

        int i=0;
        int j=0;
        if((++i>0)||(++j>0))
        {
            //打印出i和j的值。
            System.out.println(i+","+j);
        }

        ShareApple shareApple = new ShareApple();
        Thread th1 = new Thread(shareApple);
        Thread th2 = new Thread(shareApple);

        th1.setName("小明");
        th2.setName("小红");

        th1.start();
        th2.start();
    }
}
