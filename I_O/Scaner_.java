package I_O;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Scaner_ {
    public static void main(String[] args) throws IOException {
//        System.out.print("请输入:");
//        InputStream i = System.in;
//        int n = i.read();//read方法等待键盘录入，所以该方法为阻塞方法
//        System.out.println(n);
        //Scanner(System.in)才是录入的函数
        //Scanner只是扫描的作用，不一定非得扫System.in录入进来的数据,也可以扫文件中的数据
        Scanner s =new Scanner(new FileInputStream(new File("D:\\Love\\pp.txt")));
        while(s.hasNext())
        {
            System.out.println(s.next());
        }
    }
}
