package Demo14;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("请输入你想购买的披萨（1、培根 2、水果）:");
        int choice =s.nextInt();
        switch (choice)
        {
            case 1:
            {

                System.out.print("请输入培根的克数:");
                double weight = s.nextDouble();
                System.out.print("请输入披萨大小:");
                double size = s.nextDouble();
                System.out.print("请输入披萨的价格:");
                double price = s.nextDouble();
                Bacon_Pissa b = new Bacon_Pissa("培根披萨",price,size,weight);
                System.out.println(b.Show());
            }
            break;
            case 2:
            {
                System.out.print("请输入要加的配料:");
                String burdening = s.next();
                System.out.print("请输入披萨大小:");
                double size = s.nextDouble();
                System.out.print("请输入价格:");
                double price = s.nextDouble();
                Fruit_Pissa f = new Fruit_Pissa("水果披萨",price,size,burdening);
                System.out.println(f.Show());
            }
            break;
            default:
                System.out.println("选择错误!");
            break;
        }


    }
}
