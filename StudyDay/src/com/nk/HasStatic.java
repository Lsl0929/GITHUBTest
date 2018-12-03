package com.nk;

/**
 * @author 梁世龙
 * @create 2018-11-30 15:21
 */
public class HasStatic {
    private static int x = 100;
    public static void main(String args[ ]){
        HasStatic hs1 = new HasStatic();
        hs1.x++;
        HasStatic hs2 = new HasStatic();
        hs2.x++;
        hs1=new HasStatic();
        hs1.x++;
        HasStatic.x--;
        System.out.println( "x=" +x);

        StringBuffer s1 = new StringBuffer(10);
        s1.append("1234");
        System.out.println(s1.length());
        System.out.println(s1.capacity());

        int number =0;
        int count = 0;
        for (int i=0;i<=100;i++){
            number = number+i;
            count =count++;
        }

        System.out.println(number*count);
    }
}
