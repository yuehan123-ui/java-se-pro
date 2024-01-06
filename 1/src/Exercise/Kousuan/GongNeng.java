package Exercise.Kousuan;

import javax.swing.*;
import java.awt.*;

public class GongNeng extends Chuangkou{
    static int he;//两数之和
    static int cha;
    static int ji;
    static int shang;
    static JTextField textField;//  题目数目
    static String Timu;//  题目+答案
    static JTextField textField1;//  题目
    static JTextField textField2;//  答案
    static JButton button; //    确定 题目数目
    static JTextArea textArea;
    static int timunumber ;
    static int x;
    static int y;

    static int j=1;//计数器
    static int dui = 0;
    static int cuo = 0;

    public static void jia() {
        JDialog dialog = new JDialog(f, "加法界面");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("请输入本次练习的数目");
        textField = new JTextField(3);
        button = new JButton("确定");

        //点确定后
        textField1 = new JTextField(10);
        textField2 = new JTextField(4);
        textArea = new JTextArea(20, 27);

        JButton button2 = new JButton("确定/下一题");
        textArea.setBackground(Color.ORANGE);

        textArea.setEditable(false);


        textField1.setVisible(false);
        textField2.setVisible(false);
        button2.setVisible(false);
        panel.add(label);

        panel.add(textField);
        panel.add(button);
        panel.add(textField1);
        panel.add(textField2);
        panel.add(button2);
        //panel.add(label3);
        panel.add(textArea);
        dialog.add(panel);
        dialog.setVisible(true);
        dialog.setBounds(200, 200, 310, 400);

            button.addActionListener(e -> {

                timunumber = Integer.parseInt(textField.getText());//将题目数量转为整数型
                textField1.setVisible(true);
                textField2.setVisible(true);
                button2.setVisible(true);
                if(j <= timunumber){
                x = (int) (Math.random() * 100);
                y = (int) (Math.random() * 100);
                textField1.setText(x + "+" + y + "=");
                }


            });//第一个确定

        button2.addActionListener(e -> {    // 第二个确定

                he = Integer.parseInt(textField2.getText());//得到两数之和

            Timu = textField1.getText() + textField2.getText() + "\n";//得到题目和答案
            if (he==x+y){
                textArea.append(Timu+"\t"+"正确"+"\n");
                dui++;
            }
            else{
                textArea.append(Timu+"\t"+"错误,正确答案为"+(x+y)+"\n");
                cuo++;
            }

            j++;
            x = (int) (Math.random() * 100);
            y = (int) (Math.random() * 100);
            textField1.setText(x + "+" + y + "=");
            textField2.setText("");
            if (j==timunumber+1){
                textArea.append("你已经答了"+(j-1)+"道题，"+"答对"+dui+"道，"+"答错"+cuo+"道");
                textField1.setText("");
            }

        });

    }

    public static void jian() {
        JDialog dialog = new JDialog(f, "减法界面");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("请输入本次练习的数目");
        textField = new JTextField(3);
        button = new JButton("确定");

        //点确定后
        textField1 = new JTextField(10);
        textField2 = new JTextField(4);
        textArea = new JTextArea(20, 27);
        JButton button2 = new JButton("确定/下一题");
        textArea.setEditable(false);
        textField1.setVisible(false);
        textField2.setVisible(false);
        button2.setVisible(false);
        panel.add(label);

        panel.add(textField);
        panel.add(button);
        panel.add(textField1);
        panel.add(textField2);
        panel.add(button2);

        panel.add(textArea);
        dialog.add(panel);
        dialog.setVisible(true);
        dialog.setBounds(200, 200, 310, 400);

        button.addActionListener(e -> {

            timunumber = Integer.parseInt(textField.getText());//将题目数量转为整数型
            textField1.setVisible(true);
            textField2.setVisible(true);
            button2.setVisible(true);
            if(j <= timunumber){
                x = (int) (Math.random() * 100);
                y = (int) (Math.random() * 100);
                textField1.setText(x + "-" + y + "=");
            }


        });//第一个确定

        button2.addActionListener(e -> {    // 第二个确定

            cha = Integer.parseInt(textField2.getText());//得到两数之差
            Timu = textField1.getText() + textField2.getText() + "\n";//得到题目和答案

            if (cha==x-y){
                textArea.append(Timu+"\t"+"正确"+"\n");
                dui++;
            }
            else{
                textArea.append(Timu+"\t"+"错误,正确答案为"+(x-y)+"\n");
                cuo++;
            }

            j++;
            x = (int) (Math.random() * 100);
            y = (int) (Math.random() * 100);
            textField1.setText(x + "-" + y + "=");
            textField2.setText("");
            if (j==timunumber+1){
                textArea.append("你已经答了"+(j-1)+"道题，"+"答对"+dui+"道，"+"答错"+cuo+"道");
                textField1.setText("");
            }

        });

    }

    public static void cheng() {
        JDialog dialog = new JDialog(f, "乘法界面");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("请输入本次练习的数目");
        textField = new JTextField(3);
        button = new JButton("确定");

        //点确定后
        textField1 = new JTextField(10);
        textField2 = new JTextField(4);
        textArea = new JTextArea(20, 27);
        JButton button2 = new JButton("确定/下一题");
        textArea.setEditable(false);
        textField1.setVisible(false);
        textField2.setVisible(false);
        button2.setVisible(false);
        panel.add(label);

        panel.add(textField);
        panel.add(button);
        panel.add(textField1);
        panel.add(textField2);
        panel.add(button2);

        panel.add(textArea);
        dialog.add(panel);
        dialog.setVisible(true);
        dialog.setBounds(200, 200, 310, 400);

        button.addActionListener(e -> {

            timunumber = Integer.parseInt(textField.getText());//将题目数量转为整数型
            textField1.setVisible(true);
            textField2.setVisible(true);
            button2.setVisible(true);
            if(j <= timunumber){
                x = (int) (Math.random() * 100);
                y = (int) (Math.random() * 100);
                textField1.setText(x + "*" + y + "=");
            }


        });//第一个确定

        button2.addActionListener(e -> {    // 第二个确定

             ji  = Integer.parseInt(textField2.getText());//得到两数之ji
            Timu = textField1.getText() + textField2.getText() + "\n";//得到题目和答案

            if (ji==x*y){
                textArea.append(Timu+"\t"+"正确"+"\n");
                dui++;
            }
            else{
                textArea.append(Timu+"\t"+"错误,正确答案为"+(x*y)+"\n");
                cuo++;
            }

            j++;
            x = (int) (Math.random() * 100);
            y = (int) (Math.random() * 100);
            textField1.setText(x + "*" + y + "=");
            textField2.setText("");
            if (j==timunumber+1){
                textArea.append("你已经答了"+(j-1)+"道题，"+"答对"+dui+"道，"+"答错"+cuo+"道");
                textField1.setText("");
            }

        });

    }

    public static void chu() {
        JDialog dialog = new JDialog(f, "除法界面");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("请输入本次练习的数目");
        textField = new JTextField(3);
        button = new JButton("确定");

        //点确定后
        textField1 = new JTextField(10);
        textField2 = new JTextField(4);
        textArea = new JTextArea(20, 27);
        JButton button2 = new JButton("确定/下一题");
        textArea.setEditable(false);
        textField1.setVisible(false);
        textField2.setVisible(false);
        button2.setVisible(false);
        panel.add(label);

        panel.add(textField);
        panel.add(button);
        panel.add(textField1);
        panel.add(textField2);
        panel.add(button2);

        panel.add(textArea);
        dialog.add(panel);
        dialog.setVisible(true);
        dialog.setBounds(200, 200, 310, 400);

        button.addActionListener(e -> {

            timunumber = Integer.parseInt(textField.getText());//将题目数量转为整数型
            textField1.setVisible(true);
            textField2.setVisible(true);
            button2.setVisible(true);
            if(j <= timunumber){
                x = (int) (Math.random() * 100);
                y = (int) (Math.random() * 100);
                textField1.setText(x + "/" + y + "=");
            }


        });//第一个确定

        button2.addActionListener(e -> {    // 第二个确定

            shang= Integer.parseInt(textField2.getText());//得到两数之sahng
            Timu = textField1.getText() + textField2.getText() + "\n";//得到题目和答案

            if (shang==x/y){
                textArea.append(Timu+"\t"+"正确"+"\n");
                dui++;
            }
            else{
                textArea.append(Timu+"\t"+"错误,正确答案为"+(x/y)+"\n");
                cuo++;
            }

            j++;
            x = (int) (Math.random() * 100);
            y = (int) (Math.random() * 100);
            textField1.setText(x + "/" + y + "=");
            textField2.setText("");
            if (j==timunumber+1){
                textArea.append("你已经答了"+(j-1)+"道题，"+"答对"+dui+"道，"+"答错"+cuo+"道");
                textField1.setText("");
            }
        });

    }
}
