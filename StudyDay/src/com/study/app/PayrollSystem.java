package com.study.app;

/**
 * @author 梁世龙
 * @create 2018-11-09 10:51
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] e1 = new Employee[6];
        e1[0] =new  SalarieEmployee("Tom",1001,new MyDate(2,4,1991),200);
        e1[1] =new  SalarieEmployee("Tom1",1001,new MyDate(2,4,1991),200);
        e1[2] =new  SalarieEmployee("Tom2",1001,new MyDate(2,4,1991),200);

        e1[3] =new HourlyEmployee("MIKE",1001,new MyDate(2,4,1991),200,4);
        e1[4] =new HourlyEmployee("MIKE1",1001,new MyDate(2,4,1991),200,5);
        e1[5] =new HourlyEmployee("MIKE2",1001,new MyDate(2,4,1991),200,6);

        for (Employee e:e1){
            System.out.println(e);

        }

    }
}
