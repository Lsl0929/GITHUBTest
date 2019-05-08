package com.study2019.day01;

/**
 * @author 梁世龙
 * @create 2019-05-08 14:37
 * 数组冒泡排序实现
 */
public class BubbleSortTest {

    public static void main(String[] args){
        int[] arr = new int[]{43,32,22,45,44,67,88,99};
        //冒泡排序
        for (int i=0;i<arr.length-1;i++){
            for(int j =0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
