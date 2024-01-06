package com.itheima.Regex_1;

/**
           正则表达式（Regex）：用规定的字符制定规则，检验数据格式的合法性
 */
public class RegexDemo_1 {
    //    案例：检验qq号输入是否正确 （纯数字且6-20位）
    public static void main(String[] args) {

        System.out.println(checkQQ2("123456"));
        System.out.println(checkQQ2("123456a"));

    }
    //1.常规方法
    public static boolean checkQQ(String qq){
        if (qq==null||qq.length()<6||qq.length()>20) {
            return false;
        }

        for (int i = 0; i < qq.length(); i++) {
            char ch = qq.charAt(i);//获取每一位字符
            if (ch<'0'||ch>'9') {
                return false ;
            }
        }
        return true;
    }
    //2.正则表达式
    public static boolean checkQQ2(String qq){
        return qq!=null&&qq.matches("\\d{6,20}");//    \\d:表示都是数字 且在6-20位范围内
    }
}
