package com.study2019.day01;

import java.util.Arrays;

/**
 * @author 梁世龙
 * @create 2019-05-08 16:16
 * 数组工具类
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        int[] arr1 = new int[]{2,1,3,4};
        //比较
        System.out.println(Arrays.equals(arr,arr1));
        //toString
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr1,8);
        //排序
        Arrays.sort(arr1);
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

        double d=5.3e12;

        int a;
        a=6;
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);
    }
}
