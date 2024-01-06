package com.itheima.Array_1;

public class ArrayDemo3 {
    // 1、定义数组
    public static void main(String[] args) {
        int[] arr = {10, 14, 16, 25, 28, 30, 35, 88, 100};
        System.out.println(binarySearch(arr , 35));
        System.out.println(binarySearch(arr , 350));
    }


    /**
     * 二分查找算法的实现
     * @param arr  排序的数组
     * @param data 要找的数据
     * @return  索引，如果元素不存在，直接返回-1
     */
    public static int binarySearch(int[] arr, int data){
        // 1、定义左边位置  和 右边位置
        int left = 0;
        int right = arr.length - 1;

        // 2、开始循环，折半查询。
        while (left <= right){
            // 取中间索引
            //int middleIndex = (left + right) / 2; //防止结果溢出 不这么写
            int middleIndex = (right - left) / 2 + left;
            // 3、判断当前中间位置的元素和要找的元素的大小情况
            if(data > arr[middleIndex]) {
                // 往右边找，左位置更新为 = 中间索引+1
                left = middleIndex + 1;
            }else if(data < arr[middleIndex]) {
                // 往左边找，右边位置 = 中间索引 - 1
                right = middleIndex - 1;
            }else {
                return middleIndex;
            }
        }
        return -1; // 查无此元素
    }

}
