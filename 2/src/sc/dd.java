package sc;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.ItemListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class dd {

    Frame frame = new Frame("这里测试监听器");
    /*组件*/
    //下拉选择框
    Choice choice = new Choice();
    //文本框
    TextField text = new TextField(50);

    /*监听*/
    private void createListener() {
        //选择框
        ItemListener itemListener = e->{
            Object now = e.getItem();
            System.out.println("当前选择的条目为："+now);
        };
        choice.addItemListener(itemListener);
        //文本框
        text.addTextListener(new TextListener() {

            @Override
            public void textValueChanged(TextEvent e) {

                System.out.println("当前文本框中的内容为："+text.getText());
            }

        });
        //窗口
        frame.addContainerListener(new ContainerAdapter() {

            @Override
            public void componentAdded(ContainerEvent e) {

                System.out.println("frame中增加了:"+e.getChild());
            }

        });
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);

            }
        });
    }
    /*组装与初始化*/
    private void init() {
        //监听器初始化
        createListener();
        //下拉选择框初始化
        choice.add("张三");
        choice.add("李四");
        choice.add("王五");
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.add(choice);
        frame.add(text);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new dd().init();

    }

}
