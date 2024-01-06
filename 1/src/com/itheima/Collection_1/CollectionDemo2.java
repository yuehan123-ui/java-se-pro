package com.itheima.Collection_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class CollectionDemo2 {
    /**
     * 集合的遍历 ： 迭代器遍历 （集合的专用遍历方式）
     */
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");

        //1.获取迭代器对象
        Iterator<String> iterator = list.iterator();

        //2.while循环
        while(iterator.hasNext()){//判断当前位置是否有元素
            String s = iterator.next(); //得到当前元素 并 指针向后移动一个位置
            System.out.println(s);
        }
        /**
         * 迭代如果取元素越界会出现：NoSuchElementException异常 （此处无元素）
         */

        /**
         * 第二种遍历方法：增强for循环 （foreach循环）
         * 既可以遍数组也可以遍历集合
         * 遍历格式：
         * for（元素类型 变量名 ：数组或集合的名字）{}
         */
        for (String s : list) {
            System.out.println(s);
        }

        /**
         * 第三种遍历方法 常用：Lambda表达式遍历
         */
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println);
    }
}
