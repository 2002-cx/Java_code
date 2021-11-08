package Demo1;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URISyntaxException;

public class test_2{
    //用Get带参数请求访问
    public static void main(String[] args) throws IOException, URISyntaxException {
        CloseableHttpClient aDefault = HttpClients.createDefault();
        //http://rhiq8003.ia.aqlab.cn/?id=2
        /*
        要访问的目标是带参数的，id=2
        param:id
        value:2
         */
        URIBuilder ub = new URIBuilder("http://rhiq8003.ia.aqlab.cn/");
        ub.setParameter("id", "2");
        HttpGet hg = new HttpGet(ub.build());
        CloseableHttpResponse resp = aDefault.execute(hg);
        if(resp.getStatusLine().getStatusCode()==200)
        {
            String string = EntityUtils.toString(resp.getEntity(), "utf-8");
            resp.close();
            System.out.println(string);

        }
    }
}