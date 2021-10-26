package TCP_;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class client_2 {
    public static void main(String[] args) throws IOException {
        //双向通信
        Socket s = new Socket("10.32.4.228",9999);
        OutputStream ops = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(ops);
        System.out.print("请输入要发送的内容:");
        String str =new Scanner(System.in).next();
        dos.writeUTF(str);
        System.out.println("发送成功!");
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String str1 = dis.readUTF();
        System.out.println("服务端传来信息:"+str1);
        dis.close();
        is.close();
        dos.close();
        ops.close();
        s.close();
    }
}
