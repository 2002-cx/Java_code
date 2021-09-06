package Demo15;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入第一个数:");
        if(s.hasNextInt()==true)
        {
            int a = s.nextInt();

                System.out.print("请输入第二个数:");
            if(s.hasNextInt()==true)
            {
                int b = s.nextInt();
                if(b==0)
                {
                    System.out.println("被除数不能够为0！");
                }
                else
                {
                    System.out.println("商:"+a/b);

                }
            }
            else
            {
                System.out.println("请输入int类型的数！");
            }

        }
        else
        {
            System.out.println("请输入int类型的数！");
        }

        }
}
