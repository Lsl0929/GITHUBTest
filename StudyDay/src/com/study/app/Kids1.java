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
         somkid.employee();
    }
}
