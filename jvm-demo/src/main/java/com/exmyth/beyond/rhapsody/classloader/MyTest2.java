package com.exmyth.beyond.rhapsody.classloader;

/**
 * Created by exmyth on 18/5/28.
 * 常量在编译阶段,会存入调用这个常量的方法所在类的的常量池中
 * 定义常量的类初始化
 * 注意:这里常量存在MyTest2的常量吃中,MyTest2和MyParent2就没有任何关系了
 * 甚至可以删除MyParent2.class文件
 *
 * /Architect/jvm-demo/build/classes/main
 * javap -c com.exmyth.beyond.rhapsody.classloader.MyTest2
 * 助记符
 * ldc 将int,float,String类型的常量值从常量池推送到栈顶
 * sipush 将短整型(-32768 ~ 32767)的常量值从常量池推送到栈顶
 * bipush 将单字节(-128 ~ 127)的常量值从常量池推送到栈顶
 * iconst_1 将int类型1从常量池推送到栈顶(iconst_1 ~ iconst_5)
 */
public class MyTest2 {
    static {
        System.out.println("MyTest2 static block");
    }
    public static void main(String[] args) {
        System.out.println(MyParent2.str1);
    }
}

class MyParent2{
//    public static final String str1 = "hello";
    public static final int str1 = 32768;
    static {
        System.out.println("MyParent1 static block");
    }
}
