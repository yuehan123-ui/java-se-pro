package sc;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
/**
 *@author 作者 Your-Name：
 *@version 创建时间：
 *类说明：小学生口算
 */
public class c {
    static int i,j,k;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Frame f = new Frame("计算器");
        Random r = new Random();
        Font f1 = new Font("楷体",Font.BOLD,20);
        Font f2 = new Font("宋体",Font.BOLD,18);
        Font f3 = new Font("宋体",Font.BOLD,16);
        f.setBounds(200,200,500,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setBackground(Color.BLUE);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        Label l1 = new Label("小学生口算系统");
        l1.setBounds(190,40,180,30);
        l1.setFont(f1);
        f.add(l1);
        Label l2 = new Label("功能如下");
        l2.setBounds(40,70,80,30);
        l2.setFont(f2);
        f.add(l2);
        Label l3 = new Label("1,加法运算");
        l3.setBounds(70,110,80,30);
        l3.setFont(f3);
        f.add(l3);
        Label l4 = new Label("2,减法运算");
        l4.setBounds(70,150,80,30);
        l4.setFont(f3);
        f.add(l4);
        Label l5 = new Label("3,乘法运算");
        l5.setBounds(70,190,80,30);
        l5.setFont(f3);
        f.add(l5);
        Label l6 = new Label("4,除法运算");
        l6.setBounds(70,230,80,30);
        l6.setFont(f3);
        f.add(l6);
        Label l7 = new Label("请选择");
        l7.setBounds(40,280,70,30);
        l7.setFont(f3);
        f.add(l7);
        Button b1 = new Button("+");
        b1.setBounds(40,330,40,30);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a)
            {
                Frame c1 = new Frame("加法界面");
                c1.setBounds(250,250,300,300);
                c1.setLayout(null);
                c1.setVisible(true);
                c1.setBackground(Color.gray);
                c1.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e)
                    {
                        c1.setVisible(false);
                    }
                });
                TextField t2 = new TextField();
                t2.setBounds(20,50,50,30);
                t2.setFont(f2);
                c1.add(t2);
                Button b5 = new Button("+");
                b5.setBounds(70,50,30,30);
                c1.add(b5);
                TextField t3 = new TextField();
                t3.setBounds(100, 50,50,30);
                t3.setFont(f2);
                c1.add(t3);
                Button b6 = new Button("=");
                b6.setBounds(150,50,30,30);
                c1.add(b6);
                TextField t4 = new TextField();
                t4.setBounds(180, 50,50,30);
                t4.setFont(f2);
                c1.add(t4);
                t2.setText("" + (r.nextInt(101)));
                t3.setText("" + (r.nextInt(101)));
                Button b7 = new Button("确定");
                b7.setBounds(100,90,40,30);
                TextField t5 = new TextField();
                t5.setBounds(40,140,200,40);
                t5.setFont(f2);
                c1.add(t5);
                b7.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent a)
                    {
                        i = Integer.parseInt(t2.getText());
                        j = Integer.parseInt(t3.getText());
                        k = Integer.parseInt(t4.getText());
                        if(i + j == k)
                        {
                            t5.setText("回答正确");
                            t2.setText("" + (r.nextInt(101)));
                            t3.setText("" + (r.nextInt(101)));
                            t4.setText("");

                        }
                        else
                        {
                            t5.setText("" + i + "+" + ""+j+"正确答案:" + (i + j));
                            t2.setText("" + (r.nextInt(101)));
                            t3.setText("" + (r.nextInt(101)));
                            t4.setText("");


                        }

                    }
                });
                c1.add(b7);

            }
        });
        f.add(b1);
        Button b2 = new Button("-");
        b2.setBounds(90,330,40,30);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a)
            {
                Frame c2 = new Frame("减法法界面");
                c2.setBounds(250,250,300,300);
                c2.setLayout(null);
                c2.setVisible(true);
                c2.setBackground(Color.gray);
                c2.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e)
                    {
                        c2.setVisible(false);
                    }
                });
                TextField t21 = new TextField();
                t21.setBounds(20,50,50,30);
                t21.setFont(f2);
                c2.add(t21);
                Button b51 = new Button("-");
                b51.setBounds(70,50,30,30);
                c2.add(b51);
                TextField t31 = new TextField();
                t31.setBounds(100, 50,50,30);
                t31.setFont(f2);
                c2.add(t31);
                Button b61 = new Button("=");
                b61.setBounds(150,50,30,30);
                c2.add(b61);
                TextField t41 = new TextField();
                t41.setBounds(180, 50,50,30);
                t41.setFont(f2);
                c2.add(t41);
                t21.setText("" + (r.nextInt(101)));
                t31.setText("" + (r.nextInt(101)));
                Button b71 = new Button("确定");
                b71.setBounds(100,90,40,30);
                TextField t51 = new TextField();
                t51.setBounds(40,140,200,40);
                t51.setFont(f2);
                c2.add(t51);
                b71.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent a)
                    {
                        i = Integer.parseInt(t21.getText());
                        j = Integer.parseInt(t31.getText());
                        k = Integer.parseInt(t41.getText());
                        if(i - j == k)
                        {
                            t51.setText("回答正确");
                            t21.setText("" + (r.nextInt(101)));
                            t31.setText("" + (r.nextInt(101)));
                            t41.setText("");

                        }
                        else
                        {
                            t51.setText("" + i + "-" + ""+j+"正确答案:" + (i - j));
                            t21.setText("" + (r.nextInt(101)));
                            t31.setText("" + (r.nextInt(101)));
                            t41.setText("");


                        }

                    }
                });
                c2.add(b71);

            }
        });
        f.add(b2);
        Button b3 = new Button("*");
        b3.setBounds(140,330,40,30);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a)
            {
                Frame c1 = new Frame("乘法界面");
                c1.setBounds(250,250,300,300);
                c1.setLayout(null);
                c1.setVisible(true);
                c1.setBackground(Color.gray);
                c1.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e)
                    {
                        c1.setVisible(false);
                    }
                });
                TextField t2 = new TextField();
                t2.setBounds(20,50,50,30);
                t2.setFont(f2);
                c1.add(t2);
                Button b5 = new Button("*");
                b5.setBounds(70,50,30,30);
                c1.add(b5);
                TextField t3 = new TextField();
                t3.setBounds(100, 50,50,30);
                t3.setFont(f2);
                c1.add(t3);
                Button b6 = new Button("=");
                b6.setBounds(150,50,30,30);
                c1.add(b6);
                TextField t4 = new TextField();
                t4.setBounds(180, 50,50,30);
                t4.setFont(f2);
                c1.add(t4);
                t2.setText("" + (r.nextInt(10)));
                t3.setText("" + (r.nextInt(10)));
                Button b7 = new Button("确定");
                b7.setBounds(100,90,40,30);
                TextField t5 = new TextField();
                t5.setBounds(40,140,200,40);
                t5.setFont(f2);
                c1.add(t5);
                b7.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent a)
                    {
                        i = Integer.parseInt(t2.getText());
                        j = Integer.parseInt(t3.getText());
                        k = Integer.parseInt(t4.getText());
                        if(i * j == k)
                        {
                            t5.setText("回答正确");
                            t2.setText("" + (r.nextInt(10)));
                            t3.setText("" + (r.nextInt(10)));
                            t4.setText("");

                        }
                        else
                        {
                            t5.setText("" + i + "*" + ""+j+"正确答案:" + (i * j));
                            t2.setText("" + (r.nextInt(10)));
                            t3.setText("" + (r.nextInt(10)));
                            t4.setText("");


                        }

                    }
                });
                c1.add(b7);

            }
        });
        f.add(b3);
        Button b4 = new Button("/");
        b4.setBounds(190,330,40,30);
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a)
            {
                Frame c1 = new Frame("除法界面");
                c1.setBounds(250,250,300,300);
                c1.setLayout(null);
                c1.setVisible(true);
                c1.setBackground(Color.gray);
                c1.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e)
                    {
                        c1.setVisible(false);
                    }
                });
                TextField t2 = new TextField();
                t2.setBounds(20,50,50,30);
                t2.setFont(f2);
                c1.add(t2);
                Button b5 = new Button("/");
                b5.setBounds(70,50,30,30);
                c1.add(b5);
                TextField t3 = new TextField();
                t3.setBounds(100, 50,50,30);
                t3.setFont(f2);
                c1.add(t3);
                Button b6 = new Button("=");
                b6.setBounds(150,50,30,30);
                c1.add(b6);
                TextField t4 = new TextField();
                t4.setBounds(180, 50,50,30);
                t4.setFont(f2);
                c1.add(t4);
                t2.setText("" + (r.nextInt(101)));
                t3.setText("" + (r.nextInt(101) + 1));
                Button b7 = new Button("确定");
                b7.setBounds(100,90,40,30);
                TextField t5 = new TextField();
                t5.setBounds(40,140,200,40);
                t5.setFont(f2);
                c1.add(t5);
                b7.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent a)
                    {
                        i = Integer.parseInt(t2.getText());
                        j = Integer.parseInt(t3.getText());
                        k = Integer.parseInt(t4.getText());

                        if(i / j == k)
                        {
                            t5.setText("回答正确");
                            t2.setText("" + (r.nextInt(101)));
                            t3.setText("" + (r.nextInt(101) + 1));
                            t4.setText("");

                        }
                        else
                        {
                            t5.setText("" + i + "/" + ""+j+"正确答案:" + (i / j));
                            t2.setText("" + (r.nextInt(101)));
                            t3.setText("" + (r.nextInt(101) + 1));
                            t4.setText("");


                        }

                    }
                });
                c1.add(b7);

            }
        });
        f.add(b4);




    }

}


