package com.study.day02;

/**
 * @author 梁世龙
 * @create 2018-09-17 16:33
 *
 * 执行顺序
 * for（表达式1;表达式2;表达式3）
 * {
 *     //循环体4
 * }
 * 先执行“表达式1”，再进行“表达式2”的判断，
 * 判断为真则执行  “循环体”，循环体执行完以后执行表达式3.
 *
 * 下次的循环：
 * 首先执行表达式2，判断表达式3是否符合表达式2的条件；如果符合，继续执行表达式4
 * ，否则停止执行，最后执行表达式3.如果往复，直到表达式3不再满足表达式2的条件
 *
 * 总结：总的来说，执行顺序是一致的，先进行条件判断（表达式2），再执行函数体（表达式4），
 * 最后执行表达式3。如此往复，区别在于，条件判断的对象，
 * 在第一次判断时，是执行表达式1，初始化对象，后续的判断对象是执行后的结果（表达式3）
 *
 */
public class Day02_For {
    public static void main(String[] args) {
        for (int i=1;i<=150;i++){
            if(i%3==0){
                if(i%5==0){
                    if(i%7==0){
                        System.out.println(i+" foo biz baz");
                    }else{
                        System.out.println(i+" foo biz");
                    }
                }else if(i%7==0){
                    if(i%5==0){
                        System.out.println(i+" foo biz baz");
                    }else{
                        System.out.println(i+" foo baz");
                    }
                }else{
                    System.out.println(i+" foo");
                }

            }else if(i%5==0){
                if(i%7==0){
                    System.out.println(i+" biz baz");
                }else{
                    System.out.println(i+" biz");
                }
            }else if(i%7==0){
                System.out.println(i+" baz");
            }else{
                System.out.println(i);
            }

        }
    }
}