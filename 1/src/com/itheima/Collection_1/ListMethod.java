package com.itheima.Collection_1;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        /**
         * List集合 ：可重复 有索引 有序
         */
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("sql");
        list.add("sql");
        // 在某个索引位置插入元素
        list.add(2,"HTML");

        // 2.根据索引删除元素 返回被删除元素
        System.out.println(list.remove(3));
        System.out.println(list);

        // 3.根据索引获取元素 返回此元素
        System.out.println(list.get(2));

        // 4.修改索引处元素 返回修改前的元素
        System.out.println(list.set(1, "C#"));
    }
}
