package com.itheima.Regex_1;

import java.util.Scanner;

/*
*                      检验手机号码 邮箱 座机号码 格式是否正确
*                      [] 在此范围内选一个字符
*                      {} 在此范围内一共有几位字符
*/
public class RegexTest {
    public static void main(String[] args) {
        checkPhone();

    }
    public static void checkPhone(){
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您的手机号");
            String Phone = in.next();
            //15076617398
            if (Phone.matches("1[3-9]\\d{9}")){
                //                  第1  2  3-11 位
                //                 只能是1  在3-9范围内任意一个  9个任意数字
                System.out.println("正确");
                break;
            }else{
                System.out.println("错误");
            }
        }
    }
    /*
         邮箱 ：2373988684@qq.com
               wzx@163.com
               237398868we@pci.com.cn

               Phone.matches("\\w{1-30} @ [a-zA-Z0-9]{2-20} (\\.[a-zA-Z0-9]{2-20}){1-2}")
     */
/*
         座机号码：027-3572457    0273572357

                  Phone.matches("0\\d{2-6}-?\\d{5-20}")
 */
}