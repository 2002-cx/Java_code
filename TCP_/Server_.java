package TCP_;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_ {
    public static void main(String[] args) throws IOException {
        //服务端
        ServerSocket s= new ServerSocket(9999);
        System.out.println("服务端启动成功，等待接收客户端信息...");
        Socket ss = s.accept();//阻塞方法，等待接收客户端发来的数据,返回值为Socket
        InputStream is=ss.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String str= dis.readUTF();
        System.out.println("接收成功:信息为:"+str);
        dis.close();
        is.close();
        ss.close();
        s.close();

        //注意：先开启服务端再开客户端，否则会报错
    }
}
