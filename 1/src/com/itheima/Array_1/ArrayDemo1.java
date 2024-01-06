package com.itheima.Array_1;
/**
                  Array数组类的常用API
 */


import java.util.Arrays;
import java.util.Comparator;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int [] arr = {22,55,11,33,44};
        // 1.返回数组的内容
        System.out.println(Arrays.toString(arr));
        // 2.排序（默认升序）
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //3.二分搜索 （需要提前将数组排好序）
        int index = Arrays.binarySearch(arr,33);//查找33所在索引
        System.out.println(index);

        // 4.自定义数组的排序规则： Compator比较器对象 (仅支持引用类型的元素)
        Integer[]arr2 = {2,4,1,3};
        Arrays.sort(arr2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                /* if (o1>o2){  默认升序
                    return 1;//正数
                }else if(o1<o2){
                    return -1;
                }return 0; */
                //return o1-o2;//默认升序
                return o2-o1;//降序
            }
        });
        System.out.println(Arrays.toString(arr2));

        //5.自定义对象元素的排序
        Student [] arr3 = new Student[3];
        arr3[0] = new Student("王俊凯",22,180.5);
        arr3[1] = new Student("杨紫",24,165.3);
        arr3[2] = new Student("张一山",25,175.5);
        Arrays.sort(arr3, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //return o1.getAge()- o2.getAge();  用年龄作比较
                //   小数的比较：
                return Double.compare(o1.getHeight(), o2.getHeight());// 用身高做比较
            }
        });
        System.out.println(Arrays.toString(arr3));
    }

}
