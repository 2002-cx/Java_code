package Meal;

import java.util.ArrayList;
import java.util.Scanner;

public class t {
    //点菜
    Scanner s= new Scanner(System.in);
    private int chose;
    private double sum;
    //private double price=0.0;
    ArrayList<String> dish = new ArrayList<String>();
    ArrayList<Double> price = new ArrayList<Double>();
    public void begin(){
        do{
            System.out.println("0、退出");
            System.out.println("1、菜单");
            System.out.println("2、已点菜品");
            System.out.println("3、买单");
            System.out.print("请选择:");
            chose=s.nextInt();
            switch (chose){
                case 1:
                    Show();
                    System.out.println();
                    break;
                case 2:
                    dished();
                    System.out.println();
                    break;
                case 3:
                    sum_();
                    System.out.println();
                    break;
                case 0:
                    System.out.println("程序退出!");
                    exit_();
                    break;
            }
        }while(true);
    }
//已点菜品
    public void dished(){
        System.out.println("\t\t\t\t\t《已点菜品》");
        for (int i = 0; i <dish.size() ; i++) {
            System.out.println((i+1)+"、"+dish.get(i));
        }
    }
//买单
    public void sum_(){
        System.out.println("请稍等，正在结账.....");
        for (int i = 0; i <price.size() ; i++) {
            sum+=price.get(i);
        }
        System.out.printf("您总共消费:%.1f元!",sum);
        System.out.println();

    }
    //菜单
    public void Show(){
        f_show();
        System.out.println("1、鱼香肉丝  \t30.2");
        System.out.println("2、干煸四季豆\t22.4");
        System.out.println("3、泡椒牛肉 \t44.3");
        System.out.println("4、水煮肉片 \t35.9");
        System.out.println("5、拍黄瓜  \t13.2");
        f_show();
        do{
            System.out.print("请选择菜品:");
            chose = s.nextInt();
            switch (chose){
                case 1:
                    dish.add("鱼香肉丝");
                    price.add(30.2);
                    break;
                case 2:
                    dish.add("干煸四季豆");
                    price.add(22.4);
                    break;
                case 3:
                    dish.add("泡椒牛肉");
                    price.add(44.3);
                    break;
                case 4:
                    dish.add("水煮肉片");
                    price.add(35.9);
                    break;
                case 5:
                    dish.add("拍黄瓜");
                    price.add(13.2);
                    break;
                case 0:
                    System.out.println("退出选菜!");
                    break;
                default:
                    System.out.println("选择有误");
                    break;
            };
        }while(chose!=0);
        }



    public void f_show(){
        for (int i = 0; i <50 ; i++) {
            System.out.print("-");
            if (i==25)
            {
                System.out.print("《菜单》");
            }
        }
        System.out.println();
    }
    public void exit_(){
        System.exit(0);
    }
}
