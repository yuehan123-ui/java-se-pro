package com.itheima.extends_1;

public class Text {
    /*
     *         子类和父类中有重名方法或变量时 ，优先访问子类。
     *         访问父类需要在子类中 构造中转方法 用 super.方法名 实现
     */
    public static void main(String[] args) {
        student s = new student();
        s.showage();
        s.go();
    }
}
class people{
    public int age = 58;
    public void run(){
        System.out.println("父类");
    }
}
class student extends people{
     public int age = 22;
    public void run(){
        System.out.println("子类");

    }
    public void showage(){
        int age = 4;
        System.out.println(age);  //当前方法局部变量
        System.out.println(this.age); // 子类变量
        System.out.println(super.age); //父类变量
    }
    public void go(){
        super.run();
    }
}
