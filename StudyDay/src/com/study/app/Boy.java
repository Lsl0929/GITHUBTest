package com.study.app;

/**
 * @author 梁世龙
 * @create 2018-10-23 16:20
 */
public class Boy {
    private String name;

    Boy(String name){
        this.name =name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void marry(Girl girl){
        System.out.println("嫁给我吧"+girl.getName());
        /**
         * this: this是对 调用当前方法的那个当前对象的 对象的引用
         * 当前对象  ： boy.marry(girl);   测试类中 boy调用了marry方法  this代表的当前对象是Boy
         * 1.在一般方法中可以通过this来引用当前对象的成员（方法、属性）
         * 2.通过this()调用重载的构造器，通过此种方法调用重载的构造器的代码必须放在当前构造器的第一行。
         */
        girl.shot(this);
    }
}
