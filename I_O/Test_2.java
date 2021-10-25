package I_O;

import java.io.*;

public class Test_2 {
    public static void main(String[] args) throws IOException {
        System.out.println("开始录入:");
        InputStream i = System.in;
        InputStreamReader isr = new InputStreamReader(i);
        BufferedReader bfr = new BufferedReader(isr);
        File f= new File("D:\\Love\\p.txt");
        if(!f.exists())
        {
            f.createNewFile();
            System.out.println("新文件创建成功！目录为:"+(f.getPath()));
        }
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        String s = bfr.readLine();
        while(!s.equals("exit")){
            bw.write(s);
            bw.newLine();//换行
            s=bfr.readLine();
        }
        System.out.println("保存成功！");
        bw.close();
        bfr.close();

    }
}
