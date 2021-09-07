package Demo17_Exception;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) throws Exception {
        //实现：两个数相除，当除数为0时，程序出现异常
        Devide();
    }
    public static void Devide() throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入第一个数:");
        int a = s.nextInt();
        System.out.print("请输入 第二个数:");
        int b = s.nextInt();
        if(b==0)//商为0，制造异常
        {
            //制造运行时异常
            //throw new RuntimeException();
            //制造检查时异常
          /*
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
           */

            //往上抛,（throws）抛到本方法中、本方法再抛向main方法中（throws）
            throw new Exception();
        }
        else
        System.out.println("商："+a/b);

    }
}
