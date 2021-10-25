package I_O;

import java.io.*;

public class DataInputStream_ {
    public static void main(String[] args) throws IOException {
        //将数据流读取到java中、利用DataInputStream
        DataInputStream dis = new DataInputStream(new FileInputStream(new File("D:\\Love\\pig.txt")));
        System.out.println(dis.readBoolean());
        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());
        System.out.println(dis.readUTF());
        dis.close();
    }
}
