package com.study.app;

/**
 * @author 梁世龙
 * @create 2018-10-25 16:29
 */
public class Kids1 extends ManKind{
    public int yearsOld;

    public void printAge(){
        System.out.println(yearsOld);
    }

    public static void main(String[] args) {
         Kids1 somkid = new Kids1();
         somkid.sex=1;
         somkid.salary=20;
         somkid.yearsOld=50;
         somkid.manOrWoman();
         somkid.employee();
    }

    /**
     * super关键字
     * 1.可以在子类中引用父类的成员：方法和属性。和this相对于。
     * 2.在子类的构造方法中可以使用super(参数列表)语句调用父类的构造方法。super()调用父类默认的构造方法
     * 3.子类的构造方法一定要调用父类的构造方法，否则编译报错
     */
     @Override
     public void employee(){
         super.employee();
         System.out.println("不工作");
     }
}
