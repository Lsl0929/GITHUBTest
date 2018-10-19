package com.study.day02;

/**
 * @author 梁世龙
 * @create 2018-10-10 14:53
 * 关键字 class
 * 使用class关键字定义了一个类 ：
 *
 * 信息的封装和隐藏
 * 1.使用private关键字来修饰 把属性隐藏起来
 * 2.提供public 的 get set方法来访问属性
 */
public class Person {
    //构造器于类同名，且没有返回值（连void都没有）
    //jvm 会为每一个类提供一个默认的无参的构造器
    //java类中一旦定义了一个或者多个构造方法，系统将不在提供默认的构造方法
    public Person(){
        System.out.println("😀");//对实例进行初始化
        this.age = 18;
    }

    public Person(String name,int age){
        this.age =age;
        this.name=name;
    }


    //定义类的属性 ：  类型  属性名
    String name;
    //类型 属性名 = 初始值
    int age =24;
    //定义类方法
    //带返回参数的  : 返回值类型 方法名()
    int getAge(){
        return age;
    }

    //不带返回值的  return 表示方法结束，后面不能再有其他语句。
    void shout(){
        System.out.println("I am" + name);
        return;
    }

    //带参数 无返回值
    void hello(String personName){
        System.out.println(personName);
    }

    //带参数 有返回值
    int add(int i,int j){
        return  i+j;
    }
    //方法重载  一个类中可以定义多个同名方法 --- 方法名重载 overload
    //重载方法的参数列表必须不同  即 参数个数 或者参数类型 不同   返回值可以相同 也可不同  调用是根据参数类型来区别
    int add(int i,int j,int c){
        return  i+j;
    }
    //使用private关键字 ：可以修饰类的成员，一经使用private修饰，该属性将不能在外部被直接访问。
    //可以提供public方法来操作属性，getXxx()返回属性值,setXxx()为属性赋值
    private int redius;

    public double findArea(){
        return redius*redius*3.14;
    }

    public int getRedius() {
        return redius;
    }

    public void setRedius(int redius) {
        if(redius<=0){
            System.out.println("redius参数不合法");
            return;
        }
        this.redius = redius;
    }
}
