package Exercise._4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends JFrame{
    static Test JF = new Test();
    static JPanel Panel = new JPanel();
    //static JLabel JL = new JLabel("单击变色");
    //static JButton JB = new JButton("确定");
    static JMenuBar JM = new JMenuBar();
    static JMenu m1 = new JMenu("变色");
    static JMenu m2 = new JMenu("文本");
    static JMenuItem m11 = new JMenuItem("蓝色");
    static JMenuItem m12 = new JMenuItem("红色");
    static JMenuItem m13 = new JMenuItem("黑色");
    static JMenuItem m21 = new JMenuItem("你好世界");
    static JMenuItem m22 = new JMenuItem("你好中国");
    static JTextArea JTxt = new JTextArea();

    //static JTextArea JTxt = new JTextArea();
    public static void main(String[] args) {
        JF.setBounds(200,200,400,300);
        //JL.setBounds(150,50,100,100);
        //JB.setBounds(150,150,60,30);
        JF.setVisible(true);
        JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel.setBackground(Color.ORANGE);
       Panel.add(JTxt);
        //Panel.add(JL);
        //Panel.add(JB);
        m1.add(m11);//菜单项添加到菜单
        m1.add(m12);
        m1.add(m13);
        m2.add(m21);
        m2.addSeparator();//添加一条分割线
        m2.add(m22);
        JM.add(m1);//菜单添加到菜单栏
        JM.add(m2);
        JF.add(Panel);
        JF.setJMenuBar(JM);//将菜单栏添加到窗口

        m11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panel.setBackground(Color.BLUE);
            }
        });
        m12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panel.setBackground(Color.RED);
            }
        });
        m13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panel.setBackground(Color.BLACK);
            }
        });
        m21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panel.setBackground(Color.GRAY);
                JTxt.setText("hello world");
            }
        });
        m22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTxt.setText("hello CHINA");
            }
        });
    }

    /*
    public void actionPerformed(ActionEvent e){
        Panel.setBackground(Color.CYAN);

    }*/

}
