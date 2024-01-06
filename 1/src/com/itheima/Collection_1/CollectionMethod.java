package com.itheima.Collection_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionMethod {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        /**
         * Collection的方法 同样适用于List集合和Set集合
         * 1.添加元素，添加成功返回true
         */
        list.add("Java");
        list.add("Python");
        list.add("C#");
        System.out.println(list);
        /**
         * 2.清空集合元素
         */
       // list.clear();
        /**
         * 3.判断集合手机否为为空
         */
        list.isEmpty();
        //4.获取集合的大小
        System.out.println(list.size());
        //5.判断集合中是否包含某个元素
        System.out.println(list.contains("Java"));
        System.out.println(list.contains("WI"));
        //6.删除某个元素（如果有多个重复元素默认删除第一个）
        list.remove("Java");
        //7.把集合转换成数组
        Object[] arrs = list.toArray();
        System.out.println(Arrays.toString(arrs));
        //8.合并两个集合 list1.addall(list2)
    }
}
