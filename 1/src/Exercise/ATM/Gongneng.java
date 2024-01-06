package Exercise.ATM;

import javax.swing.*;

public class Gongneng extends Chuangkou{
    static double money = 1000.0;
    static double reducemoney = 0;
    static double insertmoney = 0;
    static double sendmoney = 0;
    static String id = "666666";

    public static void sendMoney() {
        JDialog dialog = new JDialog(f,"转账界面");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("请输入转账账号");
        JLabel label1 = new JLabel("请输入转款金额");
        JLabel label2 = new JLabel();
        JTextField textField = new JTextField(20);
        JTextField textField1 = new JTextField(20);
        JButton button = new JButton("确定");
        dialog.setBounds(200,200,350,130);
        dialog.setVisible(true);
        panel.add(label);
        panel.add(textField);
        panel.add(label1);
        panel.add(textField1);
        panel.add(button);
        panel.add(label2);
        dialog.add(panel);
            button.addActionListener(e -> {
                if (textField.getText().equals(id)){
                sendmoney = Double.parseDouble(textField1.getText());
                money = money - sendmoney;
                label2.setText("转款成功！");
            }});
    }
    public static void inquiryMoney() {
        JDialog dialog = new JDialog(f, "查询界面");
        JPanel panel = new JPanel();
        JLabel label = new JLabel();

        dialog.setBounds(200, 200, 400, 130);
        dialog.setVisible(true);
        label.setText("您的余额为" + money);
        panel.add(label);
        dialog.add(panel);
    }
    public static void reduceMoney() {
        JDialog dialog = new JDialog(f,"取款界面");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("请输入取款金额");
        JLabel label1 = new JLabel();
        JTextField textField1 = new JTextField(20);
        JButton button = new JButton("确定");
        dialog.setBounds(200,200,400,130);
        dialog.setVisible(true);
        panel.add(label);
        panel.add(textField1);
        panel.add(button);
        panel.add(label1);
        dialog.add(panel);
        if (textField1.getText()==null) {
            reducemoney = Double.parseDouble(textField1.getText());
            money = money - reducemoney;
        }
        button.addActionListener(e -> {
            reducemoney = Double.parseDouble(textField1.getText());
            money = money - reducemoney;
            label1.setText("取款成功，您当前余额为" + money);
        });
    }

    public static void addMoney() {
        JDialog dialog = new JDialog(f,"存款界面");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("请输入存款金额");
        JLabel label1 = new JLabel();
        JTextField textField1 = new JTextField(20);
        JButton button = new JButton("确定");
        panel.add(label);
        panel.add(textField1);
        panel.add(button);
        panel.add(label1);
        dialog.add(panel);
        dialog.setBounds(200,200,400,130);
        dialog.setVisible(true);
        button.addActionListener(e -> {
            insertmoney= Double.parseDouble(textField1.getText());
            money = money + insertmoney;
            label1.setText("存款成功，您当前余额为"+money);
        });
    }


}
