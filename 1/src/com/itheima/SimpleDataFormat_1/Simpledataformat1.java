package com.itheima.SimpleDataFormat_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
             计算出2021年08月06日11点11分11秒。往后走2天14小时49分06秒后的时间是多少
 */
public class Simpledataformat1  {
    public static void main(String[] args) throws ParseException {
        String date = "2021年08月06日 11:11:11";

        //字符串解析成日期对象  格式与上述一致 否则解析错误
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");//格式化
        Date d = sdf.parse(date);//解析

        long D =d.getTime()+(2L*24*60*60+14*60*60+49*60+6)*1000;//得到时间毫秒值
        System.out.println(    sdf.format(D)   );//格式化并输出
        System.out.println(d.getTime()-D);
        System.out.println("---------------------");

        String date1 = "1949年10月01日";
        String date2 = "2022年01月01日";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
        Date d1 = sdf1.parse(date1);
        Date d2 = sdf1.parse(date2);

        long D1 = d1.getTime();
        long D2 = d2.getTime();
        System.out.println(D1);
        System.out.println(D2);
    }
}
