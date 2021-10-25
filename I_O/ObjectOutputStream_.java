package I_O;

import java.io.*;

public class ObjectOutputStream_ {
    public static void main(String[] args) throws IOException {
        //对象流ObjectOutputStream：将内容写进出文件中
        ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(new File("D:\\Love\\dog.txt")));
        oos.writeObject("Hello_world!");
        oos.close();
    }
}
