package com.itheima.SimpleDataFormat_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
                      秒杀案例：判断小a和小b是否秒杀成功
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        String startTime = "2021年11月11日 00:00:00";
        String endTime = "2021年11月11日 00:10:00";
        String a = "2021年11月11日 00:2:20";
        String b = "2021年11月11日 00:10:10";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date start =sdf.parse(startTime);
        Date end =sdf.parse(endTime);
        Date A =sdf.parse(a);
        Date B =sdf.parse(b);

        if (A.after(start)&& A.before(end))
        {
            System.out.println("小a成功");
        }else {
            System.out.println("小a失败");
        }

    if (B.after(start)&& B.before(end))
    {
        System.out.println("小b成功");
    }else {
        System.out.println("小b失败");
    }
}
}
