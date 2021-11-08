package Demo1;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URISyntaxException;

public class test_6 {
    //HttpClient请求参数
    public static void main(String[] args) throws IOException, URISyntaxException {

        CloseableHttpClient aDefault = HttpClients.createDefault();
        URIBuilder ub = new URIBuilder("http://rhiq8003.ia.aqlab.cn/");

        ub.setParameter("id","2");
        HttpGet hg = new HttpGet(ub.build());
        //配置httpclient请求信息
        RequestConfig.custom().setConnectionRequestTimeout(500)//设置获取连接的最长时间，单位为毫
                .setSocketTimeout(10*1000)//设置数据传送的最长时间
                .setConnectTimeout(1000);//创建连接的最长时间

        hg.setConfig(hg.getConfig());
        CloseableHttpResponse response = aDefault.execute(hg);
        if(response.getStatusLine().getStatusCode()==200)
        {
            String str = EntityUtils.toString(response.getEntity(), "utf-8");
            System.out.println(str);
        }
    }
    }
