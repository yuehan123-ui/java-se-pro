package Exercise._3;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;


public class Test {
     static int i=0;
    public static void main(String[] args) {
        Random xn = new Random();
        int num = xn.nextInt(100)+1;
        Frame f = new Frame("猜数游戏");
        Label l1= new Label("测智商小游戏");
        Label l2= new Label("请输入一个100以内的整数");
        Label l3= new Label("提示");
        Label l4= new Label("测试结果");
        TextField txt1 = new TextField();
        TextField txt2 = new TextField();
        TextField txt3 = new TextField();
        Button b1 = new Button("确定");
        Button b2 = new Button("退出");
        Font ft = new Font("楷体",Font.BOLD,20);
        f.setBounds(250,250,500,300);
        f.setVisible(true); //窗口可视性
        f.setLayout(null); //关闭窗口默认布局
        f.setBackground(Color.pink);
        f.setFont(ft);

        l1.setBounds(170,30,200,30);
        l2.setBounds(20,80,240,30);
        l3.setBounds(120,130,100,30);
        l4.setBounds(100,180,100,30);
        txt1.setBounds(280,80,150,30);
        txt2.setBounds(280,130,150,30);
        txt3.setBounds(280,180,150,30);
        b1.setBounds(90,230,50,30);
        b2.setBounds(280,230,50,30);
        txt1.setBackground(Color.yellow);
        txt2.setBackground(Color.yellow);
        txt3.setBackground(Color.yellow);
        b1.setBackground(Color.magenta);
        b2.setBackground(Color.magenta);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(txt1);
        f.add(txt2);
        f.add(txt3);
        f.add(b1);
        f.add(b2);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        b2.addActionListener(e -> System.exit(0));
        b1.addActionListener(e -> {
                int x;
                        x= Integer.parseInt(txt1.getText());
                if (x==num){
                    i++;
                   txt2.setText("恭喜你，猜对了！");
                   txt3.setText("一共猜了"+i+"次");
                }
                else{
                    i++;
                    if (x<num){
                        txt2.setText("偏小");
                        txt1.setText("");
                    }
                    if (x>num){
                        txt2.setText("偏大");
                        txt1.setText("");
                    }
                }
        });
    }
}
