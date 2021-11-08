package Demo1;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class test_4 {
    public static void main(String[] args) throws IOException {
        //Post带参请求
        CloseableHttpClient aDefault = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost("http://rhiq8003.ia.aqlab.cn/");
        //申明List集合，封装表单中的参数
        List<NameValuePair> list = new ArrayList<NameValuePair>();
        //设置的请求地址为:http://rhiq8003.ia.aqlab.cn/?id=2
        list.add(new BasicNameValuePair("id","1"));
        //创建表单的Entity对象，第一个参数为封装好的参数，第二个为编码
        UrlEncodedFormEntity uefe = new UrlEncodedFormEntity(list,"utf-8");
        //设置表单的Entity到Post中
        httpPost.setEntity(uefe);
        HttpResponse response=null;
        response = aDefault.execute(httpPost);
        if(response.getStatusLine().getStatusCode()==200)
        {
            String str= EntityUtils.toString(response.getEntity(),"utf-8");
            System.out.println(str);
        }
    }
}
