package Exercise.ATM;

import javax.swing.*;
import java.awt.*;

public class Chuangkou extends JFrame  {
    int i = 0;
    String password = "1";
    String p;
    static JFrame f;
    JLabel lab1;
    JLabel lab2;
    JButton but1;
    JButton but2;
    JButton but3;
    JButton but4;
    JButton but5;
    JButton but6;
    JButton but7;
    JPanel panel;
    JPanel panel2;
    JDialog dialog;
    JPasswordField jp;
    JTextArea textArea;
    public Chuangkou(){
         f = new JFrame();
         lab1 = new JLabel("请输入密码");
         lab2 = new JLabel();
         but1 = new JButton("确定");
         but2 = new JButton("退出");
         but3 = new JButton("查询");
         but4 = new JButton("取款");
         but5 = new JButton("存款");
         but6 = new JButton("转账");
         but7 = new JButton("退出");
         panel = new JPanel();
         panel2 = new JPanel();
         jp = new JPasswordField("",20);
        setTitle("ATM登陆系统");
        setVisible(true);
        setBounds(200,200,500,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        jp.setEchoChar('*');
        panel.add(lab1);
        panel.add(jp);
        panel.add(but1);
        panel.add(but2);
        add(panel);

  }

   public void action(){
            but1.addActionListener(e -> {
                p = new String(jp.getPassword());
                if (p.equals(password)) {
                    dialog = new JDialog(f,"ATM自助取款机系统");
                    dialog.setBounds(200,200,400,130);
                    dialog.setVisible(true);
                  panel2.add(but3);
                  panel2.add(but4);
                  panel2.add(but5);
                  panel2.add(but6);
                  panel2.add(but7);
                  dialog.add(panel2);
                  action2();
                }else{
                    i++;
                    dialog = new JDialog(f,"提示");
                    textArea = new JTextArea(3,15);
                    dialog.setBounds(200,200,350,150);
                    dialog.setVisible(true);
                    dialog.add(textArea);
                    textArea.setText("您输入的密码有误，请您重新输入 您还有"+(3-i)+"次机会");
                    if (i==3){
                        textArea.setText("您的账户已冻结");
                    }
                }
            });
            but2.addActionListener(e -> System.exit(0));
   }
   public void action2(){
        but3.addActionListener(e -> Gongneng.inquiryMoney());
        but4.addActionListener(e -> Gongneng.reduceMoney());
        but5.addActionListener(e -> Gongneng.addMoney());
        but6.addActionListener(e -> Gongneng.sendMoney());
        but7.addActionListener(e -> System.exit(0));
   }
}
