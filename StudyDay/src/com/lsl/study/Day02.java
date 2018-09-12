package com.lsl.study;

/**
 * @author 梁世龙
 * @create 2018-09-11 15:07
 */
public class Day02 {

    static int arr[] = new int[5];//默认0


    public static void main(String[] args) {
        System.out.println(arr[1]);//编译正确，输出0
        String s = null;
        System.out.println((s==null) || (s.length()==0));//不会抛出NullPointException异常  逻辑运算符 && || 是按照短路的方式求值的如果第一个操作已经能够确定表达式的值，第二个表达式就不必计算了
        System.out.println( (s!=null) && (s.length()>0)); //s!=null返回false 第二个操作不会执行，不会抛出异常
      //  System.out.println(s==null&s.length()==0);//$ | 位移运算符 得到的结果是布尔值，不按短路的方式计算。即在得到结果前，一定要计算两个操作数的值。
      //  String s; //局部变量没有默认值
        System.out.println(Thread.currentThread().getName());
        Thread t1 = new Thread(new MyThread());
        t1.start();
    }
}
