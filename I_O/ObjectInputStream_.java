package I_O;

import java.io.*;

public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //ObjectInputStream:将文件中的内容输出到控制台
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("D:\\Love\\dog.txt")));
        String s= (String)ois.readObject();
        System.out.println(s);
        ois.close();
    }
}
