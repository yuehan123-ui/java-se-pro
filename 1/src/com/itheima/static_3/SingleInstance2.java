package com.itheima.static_3;

public class SingleInstance2 {
    /*
                懒汉单例设计模式：在你需要的时候才创建对象。
                实现步骤：1.将构造器私有 2.创建一个静态变量用于存储对象但不初始化 3.提供一个返回单例对象的方法
     */
    private SingleInstance2(){

    }
    private static SingleInstance2 s2;

    public static SingleInstance2 INit(){
        if (s2==null){
            s2 = new SingleInstance2();
        }
        return s2;
    }

}
