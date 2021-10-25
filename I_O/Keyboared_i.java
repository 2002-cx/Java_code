package I_O;

import java.io.*;

public class Keyboared_i {
    //将键盘输入的内容存放在本地文件夹中
    public static void main(String[] args) throws IOException {
        //1、先准备输入方向
        //键盘录入
        System.out.println("开始录入：");
        InputStream i = System.in;//类型为字节流
        //字节流->字符流
        InputStreamReader isr = new InputStreamReader(i);
        //在isr外面套一个缓冲区
        BufferedReader br = new BufferedReader(isr);
        //2、准备输出方向
        File f = new File("D:\\Love\\qwe.txt");
        if(f.exists()==false)
        {
            f.createNewFile();
            System.out.println("文件创建成功!");
        }
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw =new BufferedWriter(fw);
        //3、开始存放在文件中
        //将读取的内容存放在字符串s中
        String s = br.readLine();
        while(!s.equals("exit"))
        {
            bw.write(s);
            bw.newLine();//换行
            s=br.readLine();
        }
        System.out.println("保存成功！");
        bw.close();
        br.close();
    }
}
