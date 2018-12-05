package com.study.day06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 梁世龙
 * @create 2018-12-03 16:27
 * List
 * List代表一个元素有序、且可重复的集合，集合中的每个元素都有其对应的顺序索引
 * List允许使用重复元素，可以通过索引来访问知道位置的集合元素
 * List默认按元素的添加顺序设置元素的索引
 */
public class TestList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println(list.size());

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



        for (Object obj:list){
            System.out.println(obj);
        }

    }
}
