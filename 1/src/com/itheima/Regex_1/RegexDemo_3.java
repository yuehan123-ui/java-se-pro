package com.itheima.Regex_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
               运用正则表达式爬取信息中的部分内容
 */
public class RegexDemo_3 {
    public static void main(String[] args) {
        String rs = "来黑马程序学习Java,电话020-43422424，或者联系邮箱" +
                "itcast@itcast.cn,电话18762832633，0203232323" +
                "邮箱bozai@itcast.cn，400-100-3233 ，4001003232";

        // 需求：从上面的内容中爬取出 电话号码和邮箱。
        // 1、定义爬取规则，字符串形式
        String regex = "(\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2})|(1[3-9]\\d{9})" +
                "|(0\\d{2,6}-?\\d{5,20})|(400-?\\d{3,9}-?\\d{3,9})";

        // 2、把这个爬取规则编译成匹配对象。
        Pattern pattern = Pattern.compile(regex);

        // 3、得到一个内容匹配器对象
        Matcher matcher = pattern.matcher(rs);

        // 4、开始找了
        while (matcher.find()) {
            String rs1 = matcher.group();
            System.out.println(rs1);
        }

    }
}
