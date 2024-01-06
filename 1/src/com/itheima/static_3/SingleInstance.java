package com.itheima.static_3;

public class SingleInstance {//单例
    /*
    *        饿汉单例设计模式：在用类获取对象的时候，对象已经为你创建好了。
    *        实现步骤：1.将构造器私有（不需要再创建对象）2.定义一个静态变量存储对象。
    * */
    private SingleInstance(){

    }
    public static SingleInstance s1 = new SingleInstance();//用 类名.对象名调用 :  SingleInstance.s1
}
