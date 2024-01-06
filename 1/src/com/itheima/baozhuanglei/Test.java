package com.itheima.baozhuanglei;

/**
                 包装类: 基本数据类型对应的引用类型 （二者可相互转换 自动装箱 自动拆箱）int - Integer  char - Character 两特殊 其他皆为首字母大写
                 作用：实现一切皆对象 可以调用方法  集合和泛型不支持用基本数据类型 只能使用包装类
                 可以为null
 */
public class Test {
    public static void main(String[] args) {
        /*
                     特殊功能：1.基本数据类型转换为字符串类型 2.字符串类型转换为基本数据类型
         */
        int a = 9;
        String a1 = Integer.toString(a);//将a转换为字符串类型
        String a2 = a+"";// 也可以 变量名+空字符实现转换为字符串类型
        System.out.println("==========================");

        String s = "123";
        int s1 = Integer.parseInt(s); // 将字符串类型转换为基本数据类型
        //int s1 = Integer.valueOf(s); 通用
    }
}
