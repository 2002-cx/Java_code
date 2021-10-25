package I_O;

import java.io.*;

public class InputStreamReader_O {
    //转换流、作用：将字节流和字符流进行转换
    //转换流属于字节流还是字符流？
    //InputStreamReader\OutputStreamWriter,通过看后缀可得为字符流
    //将本地文件读取到java控制台中
    //InputStreamReader:字节输入流-->字符输入流
    //OutputStreamReader:字节输出流-->字符输出流
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\Love\\love.txt");
        FileInputStream fis = new FileInputStream(f);
        InputStreamReader isr = new InputStreamReader(fis,"utf-8");//编码格式与文本文件中编码格式与之对应，否则乱码
        char ch [] = new char[20];
        int len = isr.read(ch);
        while(len!=-1)
        {
            System.out.print(new String(ch,0,len));
            len=isr.read(ch);
        }
        System.out.println();
        System.out.println("reading over!");
        isr.close();
    }

}
