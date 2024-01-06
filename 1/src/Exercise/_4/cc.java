package Exercise._4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class cc extends Frame implements ActionListener {
    static cc f = new cc();
    static cc f2 = new cc();
    static Button b1 = new Button("确定");
    static Button b2 = new Button("退出");

    public static void main(String[] args) {
        f.setBounds(200,200,500,500);
        f2.setBounds(450,450,500,500);
        f.setVisible(true);
        f.setLayout(null);
        b1.setBounds(60,100,50,30);
        b2.setBounds(200,100,50,30);
        f.add(b1);
        f.add(b2);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f2.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f2.dispose();//释放窗口
            }
        });

        b1.addActionListener( f);
        b2.addActionListener( f);

    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1)
        {
            f2.setVisible(true);
        }

    }
}
