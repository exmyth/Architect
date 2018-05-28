package com.exmyth.beyond.rhapsody.classloader;

/**
 * Created by exmyth on 18/5/28.
 * 对于静态变量,只有直接定义了改字段的类才会被初始化
 * 当一个类初始化时候,要求其父类都已经初始化完毕
 * -XX:+TraceClassLoading, 用于追踪类的加载信息
 * -XX:+TraceClassUnloading, 用于追踪类的卸载信息
 *
 * -XX:+<option> 开启option选项
 * -XX:-<option> 关闭option选项
 * -XX:<option>=<value> 设置option值value
 */
public class MyTest1 {
    public static void main(String[] args) {
        System.out.println(MyChild1.str1);
//        System.out.println(MyChild1.str2);
    }
}

class MyParent1{
    public static String str1 = "hello";
    static {
        System.out.println("MyParent1 static block");
    }
}
class MyChild1 extends MyParent1{
    public static String str2 = "world";
    static {
        System.out.println("MyChild1 static block");
    }
}
