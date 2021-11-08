package Demo1;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URISyntaxException;

public class test_5 {

    public static void main(String[] args) throws URISyntaxException {
        //连接常量池
        PoolingHttpClientConnectionManager pc = new PoolingHttpClientConnectionManager();
        //设置最大连接数
        pc.setMaxTotal(100);
        //设置每个主机最大连接数
        pc.setDefaultMaxPerRoute(10);
        //使用连接池管理器发起请求
        doGet(pc);
        System.out.println("------------------------");
        doGet(pc);
        System.out.println("------------------------");
        doGet(pc);
        System.out.println("------------------------");
        doGet(pc);
        System.out.println("------------------------");
        doGet(pc);
        System.out.println("------------------------");

    }

    private static void doGet(PoolingHttpClientConnectionManager pc) throws URISyntaxException {
        CloseableHttpClient hp = HttpClients.custom().setConnectionManager(pc).build();
        URIBuilder ub = new URIBuilder("http://rhiq8003.ia.aqlab.cn/");
        ub.setParameter("id", "1");
        HttpGet hg = new HttpGet(ub.build());

        CloseableHttpResponse re=null;
        try {
            re = hp.execute(hg);
            if(re.getStatusLine().getStatusCode()==200)
            {
                String str=EntityUtils.toString(re.getEntity(),"utf-8");
                System.out.println(str);
                System.out.println(str.length());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(re!=null)
            {
                try {
                    re.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
