package com.study.day06;

import com.study.day02.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 梁世龙
 * @create 2018-12-10 16:21
 */
public class TestGeneric {


    public static void main(String[] args) {
        //不加泛型
        List personList = new ArrayList();
        //放的时候任何类型都可以放
        personList.add(new Person());
        //需要强制类型转换  有风险
       // Person person = (Person) personList.get(1);


        List<Person> personList1 = new ArrayList<>();
        personList1.add(new Person("aa",12));

        Person person = personList1.get(0);

        Person [] pArray = (Person[]) personList1.toArray(new Person[0]);
        System.out.println(pArray.length);

        Map<String,Person> personMap = new HashMap<String,Person>();
        personMap.put("aa",new Person("AA",12));
        personMap.put("bb",new Person("BB",13));

        for (Map.Entry<String,Person> personEntry:personMap.entrySet()){
            System.out.println(personEntry.getKey());
            System.out.println(personEntry.getValue());
        }

    }
}
