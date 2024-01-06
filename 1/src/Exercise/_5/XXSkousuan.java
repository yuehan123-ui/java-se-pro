package Exercise._5;

import java.util.Scanner;
public class XXSkousuan {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
//加法
        int x,y,q,he,cha,ji,shang,choice;
        int j=1;
        int dui = 0;
        int cuo = 0;
        String i;
        System.out.print("请输入你的名字:");
        i = in.next();//名字
        System.out.println("1.加法运算");
        System.out.println("2.减法运算");
        System.out.println("3.乘法运算");
        System.out.println("4.除法运算");
        System.out.print("请选择你要进行的操作:");
        choice = in.nextInt();
        switch(choice) {
            case 1:
                System.out.print("请选择你要练习的数量：");
                q = in.nextInt();//数量
                while(j<=q) {
                    x = (int)(Math.random()*100);
                    y = (int)(Math.random()*100);
                    System.out.print(x+"+"+y+"=");
                    he = in.nextInt();
                    if(he == (x+y))
                    {System.out.println("答对了");dui++;}
                    else
                    {System.out.println("答错了，正确答案是"+(x+y));cuo++;}
                    j++;
                }
                System.out.println("一共答题"+q+"道"+"答对"+dui+"道"+"答错"+cuo+"道");
                break;
//减法
            case 2:
                System.out.print("请选择你要练习的数量：");
                q = in.nextInt();//数量
                while(j<=q)
                {
                    x = (int)(Math.random()*100);
                    y = (int)(Math.random()*100);
                    if(x>y)
                    {
                        System.out.print(x+"-"+y+"=");
                        cha = in.nextInt();
                        if(cha == (x-y))
                        {System.out.println("答对了");dui++;}
                        else
                        {System.out.println("答错了，正确答案是"+(x-y));cuo++;}
                        j++;
                    }
                }
                System.out.println("一共答题"+q+"道"+"答对"+dui+"道"+"答错"+cuo+"道");
                break;
//乘法
            case 3:
                System.out.print("请选择你要练习的数量：");
                q = in.nextInt();//数量
                while(j<=q)
                {
                    x = (int)(Math.random()*100);
                    y = (int)(Math.random()*100);
                    System.out.print(x+"*"+y+"=");
                    ji = in.nextInt();
                    if(ji == (x*y))
                    {System.out.println("答对了");dui++;}
                    else
                    {System.out.print("答错了，正确答案为:"+"(x*y)");cuo++;}
                    j++;
                }
                System.out.println("一共答题"+q+"道"+"答对"+dui+"道"+"答错"+cuo+"道");
                break;
//除法
            case 4:
                System.out.print("请选择你要练习的数量：");
                q = in.nextInt();//数量
                while(j<=q)
                {
                    x = (int)(Math.random()*100);
                    y = (int)(Math.random()*100);
                    if(x%y==0)
                        System.out.print(x+"÷"+y+"=");
                    else
                        continue;
                    shang = in.nextInt();
                    if(shang == (x/y))
                    {System.out.println("答对了");dui++;}
                    else
                    {System.out.print("答错了，正确答案为:"+"(x/y)");cuo++;}
                    j++;
                }
                System.out.println("一共答题"+q+"道"+"答对"+dui+"道"+"答错"+cuo+"道");
                break;
        }
    }
}
