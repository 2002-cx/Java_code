package Demo16;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try {
            System.out.print("请输入第一个数:");
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            System.out.println("请输入第二个数：");
            int b = s.nextInt();
            System.out.println("商:"+a/b);
            return ;
        }catch (Exception e){
            //1)直接不输
            //2）输入提示信息


            System.out.println("Sorry，输入有误");
             //3)打印异常信息

            System.out.println(e);

            System.out.println(e.toString());

            //4)显示异常堆栈信息，将异常信息捕获之后，在控制台将异常的效果显示出来，方便查看异常
            //e.printStackTrace();
            //5):显示异常描述信息对应字符串,如果没有描述信息就输出null
            e.getMessage();
            //6):抛出异常throw.e;
            throw e;

        }finally{
            System.out.println("finally里的代码必须执行");
        }

    }
}
