package I_O;

import java.io.*;

public class InputStreamReader_InputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        //将一个文件的内容复制到另外一个文件中去
        //源文件
        File f = new File("D:\\Love\\love.txt");
        //目标文件
        File f1=  new File("D:\\Love\\pp.txt");
        if(f1.exists()==false)
        {
            f1.createNewFile();
        }
        FileInputStream fis = new FileInputStream(f);
        InputStreamReader isr = new InputStreamReader(fis,"utf-8");
        FileOutputStream fos = new FileOutputStream(f1);
        OutputStreamWriter osw = new OutputStreamWriter(fos,"gbk");
        char ch[] = new char[20];
        int len  = isr.read(ch);
        while(len!=-1)
        {
            osw.write(ch,0,len);
            len=isr.read(ch);
        }
        //关闭流
        System.out.println("Writring over!");
        osw.close();
        isr.close();

    }
}
