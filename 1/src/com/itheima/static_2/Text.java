package com.itheima.static_2;

import java.util.ArrayList;

public class Text {
    /*
              静态代码块：用于静态数据初始化，随着类加载而加载，只加载一次

              斗地主： 在开局前，需要提前准备好54张牌。
    */
    public static ArrayList<String> cards = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("牌"+cards);
    }


    static {

        String [] colors = {"♠","♥","♦","♣"};
        String [] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                cards.add(colors[j]+numbers[i]);
            }
        }
        cards.add("小王");
        cards.add("大王");
    }
}
