package I_O;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream_ {
    public static void main(String[] args) throws IOException {
        //数据流：用来操作基本数据类型和字符串
         //DataInputStream:将文件中存储的基本数据类型和字符串，写入内存中
        //DataOutputStream:将内存中基本数据类型和字符串写出到文件中
        //DataOutputStream
//        File f = new File("D:\\Love\\pig.txt");
//        FileOutputStream fos = new FileOutputStream(f);
//        DataOutputStream dos = new DataOutputStream(fos);
        //将其合并为一句话:
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(new File("D:\\Love\\pig.txt")));
        dos.writeBoolean(true);
        dos.writeInt(242);
        dos.writeDouble(22.323);
        dos.writeUTF("hello_world");
        System.out.println("写入文件成功!");
        dos.close();
    }
}
