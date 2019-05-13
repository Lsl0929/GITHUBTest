package com.study2019.day01.day02;

/**
 * @author 梁世龙
 * @create 2019-05-10 14:19
 * 方法的声明和使用
 *  声明  权限修饰符  返回值类型  方法名（形参列表）{   方法体  }
 *  有返回值 vs 无返回值   根据需求
 *  方法名 ： 属于标识符，遵循标识符的规则和规范
 *  方法的使用：可以调用当前类的属性或方法
 *             特殊：方法A调用了方法A： 递归方法
 */
public class CustomerTest {
    public static void main(String[] args) {
            Customer c = new Customer();
            c.eat();
            c.sleep(10);
    }
}
