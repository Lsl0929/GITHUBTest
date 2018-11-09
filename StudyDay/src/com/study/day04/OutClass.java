package com.study.day04;

/**
 * @author 梁世龙
 * @create 2018-11-09 16:14
 *  * 内部类
 *  * 1.在类的内部定义的类称为内部类
 *  * 2.内部类相当于类的一个成员，可以修饰的成员的private，static，final，abstract都可以修饰内部类。
 *  * 3.该类只是为类的内部使用时，可以定义为内部类
 * 非静态内部类创建实例，先创建外部类的实例，再通过外部类实例名.new 创建内部类的实例.
 * OutClass outClass = new OutClass();
 *         //创建内部类的实例
 *   OutClass.InnerClass innerClass = outClass.new InnerClass();
 *   静态内部类创建实例
 *   OutClass.StaticClass SC = new OutClass.StaticClass();
 *   4.内部类引用外部类的成员：
 */
public class OutClass {

    String name = "tom";


    //内部类
    class InnerClass{
        String name = "tom1";
        public void  test(){
            String name = "tom2";
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(OutClass.this.name);
        }

    }
    //静态内部类
    static class StaticClass{

    }
}
