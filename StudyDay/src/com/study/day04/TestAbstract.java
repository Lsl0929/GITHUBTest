package com.study.day04;

/**
 * @author 梁世龙
 * @create 2018-11-09 10:20
 * abstract 抽象
 * abstract 关键字可以修饰类和方法
 * abstract 修饰的类称为抽象类，修饰的方法称为抽象方法
 * 抽象类：不能被实例化，就是被继承的类。
 * 抽象方法：没有方法体的方法 .抽象方法所在的类一定是抽象类.抽象方法是用来被子类重写的。
 * 注意：私有方法和构造方法不能被继承，而抽象类就是用来被继承的，所以abstract不能修饰私有方法和构造方法
 * 静态方法不存在重写。
 * 抽象类是用来模型化那些父类无法确定全部实现，而是由子类提供具体实现的对象的类。
 */

public  class TestAbstract {
    public static void main(String[] args) {
        // E e = new E(); 抽象类不能被实例化
        E e = new F();
        e.test();
    }

}

//抽象类
abstract class E {
    //抽象方法
    abstract void test();
}

class F extends E{
    @Override
    void test(){

    }
}
