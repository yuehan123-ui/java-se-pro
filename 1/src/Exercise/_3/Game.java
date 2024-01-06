package Exercise._3;
import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random xn = new Random();
        int i =0;
        int num = xn.nextInt(100)+1;
        System.out.println("请输入一个整数：");
        while(true){
            i++;
            int x = in.nextInt();
            if (x==num){
                System.out.println("恭喜你，猜对了！,一共猜了"+i + "次");
                break;
            }
            else{
                if (x<num){
                    System.out.println("偏小");
                }
                if (x>num){
                    System.out.println("偏大");
                }
            }
        }
    }
}
