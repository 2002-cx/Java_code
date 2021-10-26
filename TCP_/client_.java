package TCP_;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client_ {
    //1、单项通信
    //功能：客户端发送一句话到服务端
    //1个客户端、一个服务端、
    public static void main(String[] args) throws IOException {
        //客户端
        //1、创建套接字
        Socket s = new Socket("10.32.4.228",9999);
        //2、利用输出流，向外发送数据
        OutputStream ops = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(ops);
        System.out.print("请输入你要发送的数据:");
        String str = new Scanner(System.in).next();
        dos.writeUTF(str);
        System.out.println("发送成功！");
        dos.close();
        ops.close();
        s.close();
    }
}
