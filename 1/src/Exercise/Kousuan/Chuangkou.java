package Exercise.Kousuan;

import Exercise.ATM.Gongneng;//导入其他包的方法

import javax.swing.*;
import java.awt.*;

public class Chuangkou extends JFrame {
    static JFrame f ;
    JPanel panel;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    public Chuangkou(){
        f = new JFrame();
        panel = new JPanel();
        button1 = new JButton("加法");
        button2 = new JButton("减法");
        button3 = new JButton("乘法");
        button4 = new JButton("除法");
        button5 = new JButton("退出");
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        add(panel);
        setTitle("小学生口算题系统");
        setBounds(200,200,500,100);
        setVisible(true);
        setLayout(new FlowLayout());
    }
    public void action(){
        button1.addActionListener(e -> GongNeng.jia());
        button2.addActionListener(e -> GongNeng.jian());
        button3.addActionListener(e -> GongNeng.cheng());
        button4.addActionListener(e -> GongNeng.chu());
        button5.addActionListener(e -> System.exit(0));
    }
}
