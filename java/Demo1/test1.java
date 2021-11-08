package Demo1;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class test1 {
    public static void main(String[] args) {
        //1、打开浏览器
        CloseableHttpClient hc = HttpClients.createDefault();
        //2、输入网址、发起Get请求创建HttpGet对象
        HttpGet hg = new HttpGet("http://www.itcast.cn");
        //3、发起请求、返回响应
        CloseableHttpResponse response = null;
        try {
            response = hc.execute(hg);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //4、解析响应、获取数据

        //判断状态码是否为200，为200则正常
        if (response.getStatusLine().getStatusCode()==200) {
            //获得响应体
            HttpEntity ht = response.getEntity();
            //解析响应体
            String str = null;
            try {
                str = EntityUtils.toString(ht, "utf-8");
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    response.close();//资源释放，关闭response请求
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("长度为:"+str.length());
            System.out.println(str);
        }
        else
        {
            System.out.println("响应错误！");
        }

    }
}
