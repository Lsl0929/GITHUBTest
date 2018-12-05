package com.study.day06;

import java.util.*;

/**
 * @author 梁世龙
 * @create 2018-12-04 9:40
 * Map
 * Map用于保存具有映射关系的数据
 * Map中的key和value都可以是任何引用类型的数据
 * Map中的key不允许重复
 *
 */
public class TestMap {
    public static void main(String[] args) {

        Map<String,Object> map = new HashMap<String,Object>();
        //添加元素
        map.put("1","1");
        map.put("2","2");
        System.out.println(map.size());
        //获取元素
        map.get("1");
        //遍历
        //得到key的集合
        Set keyset = map.keySet();
        for (Object o:keyset){
            Object value = map.get(o);
            System.out.println(o+":"+value);
        }
        //得到value的集合
        Collection values = map.values();
        Iterator iterator = values.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //得到键值对的集合
        for(Map.Entry<String,Object> entry:map.entrySet()){
            String key =entry.getKey();
            Object value = entry.getValue();
            System.out.println(key+":"+value);
        }
        //判断map中是否有key
        System.out.println(map.containsKey("1"));
        System.out.println(map.isEmpty());



    }
}
