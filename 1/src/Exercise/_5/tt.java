package Exercise._5;

import javax.swing.*;
import java.awt.*;

public class tt {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setVisible(true);
        jf.setBounds(200,200,200,150);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        JTextField txt = new JTextField(15);
        p1.add(txt);
        jf.add(p1,BorderLayout.NORTH);

        String s[] = {"0","1","2","3","4","5","6","7","8","9","+","-","*","/","="};

        for (int i = 0; i < s.length; i++) {
            p2.add(new Button(s[i]));
        }
        p2.setLayout(new GridLayout(3,5,4,4));
        jf.add(p2);
    }
}
