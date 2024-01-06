package com.itheima.Regex_1;

/*
               public String[] split(String regex) 按照正则表达式匹配的内容进行分割字符串 返回一个数组里
               public String replaceAll(String regex,Sting new Str) 按照正则表达式匹配的内容进行替换
 */
public class RegexDemo_2 {
    public static void main(String[] args) {
        String name = "张三wdwdwad121李四121241王五wdwdw";
        String [] arr = name.split("\\w+");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String arr2 = name.replaceAll("\\w+","+");
        System.out.println(arr2);
    }
}
