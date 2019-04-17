package com.nk;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        int i, sum=0;

        for(i=0;i<10;++i,sum+=i);
        System.out.println(i);

        int x =1;c=2;b=3;
        System.out.println(c+=b--/x++);
        /**
         * 下列关于java抽象类的说法哪个正确？
         *一个类只能继承一个抽象类  java单继承多实现
         */

        double ss =3.0;
        int ss1 =5;
        System.out.println(ss+=--ss1); // ss+=--s1   ss=ss+--s1

        List list=new ArrayList();
        list.add("a");
        list.add("b");
        list.add("a");
        Set set=new HashSet();
        set.add("a");
        set.add("b");
        set.add("a");
        //List是有序的Collection，使用此接口能够精确的控制每个元素插入的位置。
        // 用户能够使用索引（元素在List中的位置，类似于数组下标）来访问List中的元素，这类似于Java的数组。
        // 和Set不同，List允许有相同的元素。
        //Set是一种不包含重复元素的Collection，即任意的两个元素e1和e2都有e1.equals(e2)=false，Set最多有一个null元素。
        //list.size() 值为3  set.size()值为2
        System.out.println(list.size()+","+set.size());
        //对于一个已经不被任何变量引用的对象，当垃圾回收器准备回收该对象所占用的内存时，将自动调用该对象的哪个方法（）finalize()
        //对于子类的构造函数说明，下列叙述中错误的是（）。 子类可以继承父类的构造函数。 java继承中对构造函数是不继承的，只是显式或者隐式调用
    }

}
