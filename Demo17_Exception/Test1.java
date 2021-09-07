package Demo17_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int a,b;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i <3 ; i++) {
            try{
                System.out.print("请输入第一个数:");
                a = s.nextInt();
                System.out.print("请输入第二个数:");
                b=s.nextInt();
                System.out.println("商:"+a/b);
            }catch(ArithmeticException e){
                System.out.println(e.getMessage());
                System.out.println("对不起，被除数不能为0");
            }catch (InputMismatchException e)
            {

                System.out.println(e.toString());
                System.out.println("对不起，请输入整形类型的数");
            }
        }
    }
}
