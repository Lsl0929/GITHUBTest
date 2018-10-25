package com.study.app;

/**
 * @author 梁世龙
 * @create 2018-10-25 15:48
 */
public class PassObject {

    public static void main(String[] args) {
        PassObject ps = new PassObject();
        Circle c= new Circle();
        ps.ptintAreas(c,5);
    }

    public  void ptintAreas(Circle c,int time){
        for (int i =1;i<=time;i++){
            c.setRadius(i);
            System.out.println(c.getRadius()+"\t\t"+c.findArea());
        }
    }
}
