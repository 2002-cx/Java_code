package TCP_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_2 {
    //双向通信
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9999);
        System.out.println("服务端启动成功，等待服务端数据...");
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String str = dis.readUTF();
        System.out.println("读取内容成功，内容为:"+str);
        OutputStream ops = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(ops);
        dos.writeUTF("服务端读取内容成功!");
        dos.close();
        ops.close();
        dis.close();
        is.close();
        s.close();
        ss.close();
    }
}
