package com.itheima.Collection_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo1 {
    public static void main(String[] args) {
        /**  Collection集合分为list和set两大类
         * list集合类：有序 可重复 有索引
         */
        Collection list1 = new ArrayList();
        list1.add("张三");
        list1.add("李四");
        list1.add("Java");
        list1.add(25);
        list1.add(25);
        System.out.println(list1);

        /**
         * set集合类：无序 不重复 无索引
         */
        Collection list2 = new HashSet();
        list2.add("张三");
        list2.add("李四");
        list2.add("Java");
        list2.add(25);
        list2.add(25);
        System.out.println(list2);

        /**
         * 泛型约束集合存储某种类型数据 只支持引用数据类型
         */
        Collection<Integer> list = new ArrayList<>();
    }
}
