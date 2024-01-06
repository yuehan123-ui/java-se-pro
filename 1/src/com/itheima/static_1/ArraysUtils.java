package com.itheima.static_1;

public class ArraysUtils {
    /*
           工具类：要求构造器必须私有，因为不需要构造对象。   类名.静态方法  访问
           */

    private ArraysUtils(){

    }
    public static String toString(int [] arr){
        //返回整数数组的内容
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (arr!=null){
                result += (i== arr.length-1?arr[i]:arr[i]+",");
            }else{
                return null;
            }
        }
        result+="]";
        return result;
    }
    public static double caluscore(int [] arr){
        //去掉最高最低计算平均分
        double max = arr[0];
        double min = arr[0];
        double sum =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
            if (arr[i]<min){
                min = arr[i];
            }
            sum+=arr[i];
        }
        return (sum-max-min)/ (arr.length-2);
    }
}
