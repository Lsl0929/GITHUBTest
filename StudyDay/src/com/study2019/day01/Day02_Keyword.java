package com.study2019.day01;

import org.junit.jupiter.api.Test;

/**
 * @author Lsl
 * @date 2019/4/18
 * 关键字
 * 定义：被java语言赋予了特殊含义，用作专门的用途的字符串
 * 特点：关键字中所有字母都是小写的
 *
 * 标识符
 * 凡是自己可以起名的地方都叫标识符
 * 命名规则
 * 由26个英文字母大小写，0-9，_或$组成
 * 数字不可以开头
 * 不可以使用关键字和保留字，但能包含关键字和保留字
 * Java中严格区分大小写，长度无限制
 * 不能包含空格
 *
 * 标识符命名规范
 * 包名：多单词组成时所有字母都小写  xxxyyyy
 * 类名、接口名：多单词组成时，所有单词的首字母大写  XxxYy
 * 变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始首字母大写： xxxYy
 * 常量名：所有字母单都大写。多单词时用下划线连接：XX_YY
 */
public class Day02_Keyword {

    /**
     * 变量
     * 数据类型 变量名 = 变量值
     *  变量必须先声明，后使用
     *  作用域 {} 内
     *
     *  变量的数据类型
     *  基本数据类型
     *  数值型：整数类型（byte，shor，long）    浮点型（float，double）
     *  字符型（char）
     *  布尔型（boolean）
     *  基本类型中，如果不明确指定，整数型的默认类型是int，带小数的默认类型是double
     *  byte,short,char之间不会相互转换，他们三者在计算时首先转换为int类型。
     *  有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算。
     *
     *  引用数据类型
     *  类（class）
     *  接口（interface）
     *  数组（[]）
     */
    @Test
    public static void main(String[] args) {
        int myAge = 27;
        System.out.println(myAge);
        //byte 范围  -128~127
        byte b = 127;
        short s = 127;
        long l1 = 23l;//声明long型变量，必须以“l”或“L”结尾
        System.out.println(l1);

        // 浮点型（float，double）  通常情况下默认使用double类型，声明float类型常量，须后加‘f’或者‘F’
        double d1 = 12.3;
        float f1 = 12.3f;

        //字符型 char  1字符等于2字节
        char c1= 'a';
        System.out.println(c1);

        //布尔型（boolean） 只能是 true  false
        boolean b1 = true;
        System.out.println(b1);
    }

}
