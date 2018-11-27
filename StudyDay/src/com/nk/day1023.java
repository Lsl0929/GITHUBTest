package com.nk;

/**
 * @author 梁世龙
 * @create 2018-10-23 15:47
 */


public class day1023 {
    //每天10道牛客java面试题
    //在JAVA中，无论在何处调用，使用静态属性必须以类目做前缀   错误  本类使用，可以直接使用静态变量名。非本类可以使用类名.属性名 也可以new一个对象来调用
    //final关键字可以用来修饰方法，表明此方法不可以被子类重写
    //下面那个行为被打断不会导致InterruptedException
    //InterruptedException实质上是一个检测异常，它表明又一个阻塞的被中断了，它尝试进行解除阻塞操作并返回地更早一些
    //String StringBuffer  String是不可变的对象，StringBuffer是可以再编辑的 字符串是常量，StringBuffer是变量 线程安全 加了同步锁
    //StringBuilder 非线程安全   多线程使用StringBuffer  单线程使用StringBuilder 效率更高


    public static void main(String[] args){
        int a[][] ={{1,2},{3,4},{5,6}};
        System.out.println(a[1][1]);//a[1][1] 值为4  数组下标从0开始  a[1][1] 只的是第二个数组的第二位
        short b = 128;
        byte c =(byte) b;
        System.out.println(c);

        String s1 = new String("xyz");
        String s2 = new String("xyz");
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);

        String[] s= new String[10];
        System.out.println(s[9]);//值为null
        System.out.println(s.length);//数组长度为10

        

    }

}
