package Exercise._5;

/*
*                 简易计算器
*
* */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calc extends Frame implements ActionListener{ //3标签 3文本框 4按钮
    static Calc f = new Calc();
    static Label l1 = new Label("x");
    static Label l2 = new Label("y");
    static Label l3 = new Label("结果");
    static TextField txt1 = new TextField();
    static TextField txt2 = new TextField();
    static TextField txt3 = new TextField();
    static Button b1 = new Button("求和");
    static Button b2 = new Button("求差");
    static Button b3 = new Button("求商");
    static Button b4 = new Button("求积");
    static Button b5 = new Button("清除");
    static Button b6 = new Button("退出");
    static Double x;
    static Double y;

    public static void main(String[] args) {
        f.setTitle("计算器");
        f.setBounds(250,250,400,300);
        f.setVisible(true);
        f.setLayout(null);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
              System.exit(0);
            }
        });
        l1.setBounds(60,30,50,30);
        l2.setBounds(60,60,50,30);
        l3.setBounds(60,140,50,60);
        txt1.setBounds(150,40,150,20);
        txt2.setBounds(150,70,150,20);
        txt3.setBounds(150,160,150,20);
        b1.setBounds(60,100,50,30);
        b2.setBounds(130,100,50,30);
        b3.setBounds(200,100,50,30);
        b4.setBounds(260,100,50,30);
        b5.setBounds(120,210,50,30);
        b6.setBounds(260,210,50,30);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(txt1);
        f.add(txt2);
        f.add(txt3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        b1.addActionListener(f);
        b2.addActionListener(f);
        b3.addActionListener(f);
        b4.addActionListener(f);
        b5.addActionListener(f);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
           x= Double.parseDouble(txt1.getText());
           y= Double.parseDouble(txt2.getText());
           Double sum = x+y;
           txt3.setText(  Double.toString(sum));
        }
        if(e.getSource()==b2){
            x= Double.parseDouble(txt1.getText());
            y= Double.parseDouble(txt2.getText());
            Double cha =x - y;
            txt3.setText(  Double.toString(cha));
        }
        if(e.getSource()==b3){
            x= Double.parseDouble(txt1.getText());
            y= Double.parseDouble(txt2.getText());
            Double shang =x / y;
            txt3.setText(  Double.toString(shang));
        }
        if(e.getSource()==b4){
            x= Double.parseDouble(txt1.getText());
            y= Double.parseDouble(txt2.getText());
            Double ji =x * y;
            txt3.setText(  Double.toString(ji));
        }
        if(e.getSource()==b5){
            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
        }
    }
}
