package com.study.day03;

/**
 * @author 梁世龙
 * @create 2018-10-19 16:18
 */
public class MethodOverload {


   public void  mOL(int a){
       System.out.println(a*a);
   }

   public void  mOL(int a,int b){
       System.out.println(a*b);
   }

    public void  mOL(String a){
        System.out.println("CallMOL="+a);
    }

    public int max(int a ,int b){
       return a>b?a:b;
    }
    public double max(double a ,double b){
        return a>b?a:b;
    }
    public double max(double a ,double b,double c){

       return max(a,b)>c?max(a,b):c;
    }
}
