package com.study.app;

/**
 * @author 梁世龙
 * @create 2018-10-25 16:26
 * 继承
 */
public class ManKind {
    public int sex;
    public int salary;
    public void manOrWoman(){
        if(sex==1){
            System.out.println("man");
        }else{
            System.out.println("woman");
        }
    }

    public void employee(){
        if(salary==1){
            System.out.println("工作");
        }else{
            System.out.println("无工作");
        }
    }
}
