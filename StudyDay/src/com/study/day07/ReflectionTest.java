package com.study.day07;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 梁世龙
 * @create 2019-02-12 9:38
 * java反射
 * 关于Class
 * 1.Class是一个类
 * 2.对象照镜子后可以得到的信息：某个类的数据成员名、方法和构造器、某个类到底实现了哪些接口。
 * 3.对于每个类而言，JRE 都为其保留一个不变的 Class 类型的对象。
 * 一个 Class 对象包含了特定某个类的有关信息。
 * 4.Class 对象只能由系统建立对象
 * 5.一个类在 JVM 中只会有一个Class实例
 */
public class ReflectionTest {



    /**
     * 反射小结:
     *
     * 1. Class: 是一个类; 一个描述类的类. 封装了描述方法的 Method, 描述字段的 Filed,
     * 描述构造器的 Constructor 等属性.
     *
     * 2. 如何得到 Class 对象:
     * 2.1 Person.class
     * 2.2 person.getClass()
     * 2.3 Class.forName("com.atguigu.javase.Person")
     *
     * 3. 关于 Method:
     * 3.1 如何获取 Method:
     * 1). getDeclaredMethods: 得到 Method 的数组.
     * 2). getDeclaredMethod(String methondName, Class ... parameterTypes)
     *
     * 3.2 如果调用 Method
     * 1). 如果方法时 private 修饰的, 需要先调用 Method 的　setAccessible(true), 使其
     * 变为可访问
     * 2). method.invoke(obj, Object ... args);
     *
     * 4. 关于 Field:
     * 3.1 如何获取 Field: getField(String fieldName)
     * 3.2 如何获取 Field 的值:
     * 1). setAccessible(true)
     * 2). field.get(Object obj)
     * 3.3 如何设置 Field 的值:
     * field.set(Obejct obj, Object val)
     *
     * 5. 了解 Constructor 和 Annotation
     *
     * 6. 反射和泛型.
     * 6.1 getGenericSuperClass: 获取带泛型参数的父类, 返回值为: BaseDao<Employee, String>
     * 6.2 Type 的子接口: ParameterizedType
     * 6.3 可以调用 ParameterizedType 的 Type[] getActualTypeArguments() 获取泛型
     * 参数的数组.
     *
     * 7. 搞定 ReflectinUtils 即可.
     *
     */


    /**
     * Class是对一个类的描述
     * 类的属性：Field
     * 类的方法：Method
     * 类的构造器：Constrctor
     */
    @Test
    public void testClass() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class clazz =Class.forName("com.study.day07.Person");
        //1.得到clazz对应的类中有哪些方法,不能获取private方法。
        Method [] methods = clazz.getMethods();
        for (Method m:methods){
            System.out.println(m.getName());
        }
        //2.获取所有方法，包括private方法，且只获取当前类声明的方法
        Method [] methods1 = clazz.getDeclaredMethods();
        for (Method m:methods1){
            System.out.println("`"+m.getName());
        }
        //获取方法的目的  执行方法
        Method method = clazz.getDeclaredMethod("setName",String.class);
        Object obj =clazz.newInstance();
        method.invoke(obj,"尚硅谷");
    }

    @Test
    public void testFiled() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        String className = "com.study.day07.Person";
        Class clazz = Class.forName(className);

        //获取字段
        //获取Filed数组
        Field [] fields = clazz.getDeclaredFields();
        for (Field f:fields){
            System.out.println(f.getName());
        }

        //获取指定名称的字段
        Field field = clazz.getDeclaredField("name");
        field.setAccessible(true);
        System.out.println(field.getName());

        //获取指定对象的值
        Person person = new Person("abc",12);
        Object val = field.get(person);
        System.out.println(val);

        field.set(person,"1233");
        System.out.println(person.getName());
        System.out.println(person.getAge());

    }

}
