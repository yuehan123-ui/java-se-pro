package sc;



import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class Picture extends JFrame{
    public Picture() {
        JFrame jf = new JFrame("背景图片");
        jf.setSize( 600, 400);
        ImageIcon img = new ImageIcon("img/img.jpg");//创建图标组件对象，并给出图片的保存位置
        img.setImage(img.getImage().getScaledInstance(600,400, Image.SCALE_DEFAULT));//设置图片（获得图片、获得并设置大小规模）
        JLabel l = new JLabel(img);
        l.setSize( 600, 400);
        JPanel jp = new JPanel();
        //把内容面板转换为JPanel，否则不能使用方法setOpaque（）是内容面板透明
        jp = (JPanel)jf.getContentPane();
        jp.setOpaque(false);
        jf.getLayeredPane().setLayout(null);
        Integer it = new Integer(Integer.MIN_VALUE);
        jf.getLayeredPane().add(l);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Picture p = new Picture();

    }
}
