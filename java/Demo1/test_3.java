package Demo1;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URISyntaxException;

public class test_3 {
//Post请求
public static void main(String[] args) throws URISyntaxException, IOException {
    CloseableHttpClient aDefault = HttpClients.createDefault();
    //http://rhiq8003.ia.aqlab.cn/?id=2
    URIBuilder ub = new URIBuilder("http://rhiq8003.ia.aqlab.cn/");
    ub.setParameter("id","1");
    HttpPost hp = new HttpPost(ub.build());
    HttpResponse response=null;
    response = aDefault.execute(hp);
    if(response.getStatusLine().getStatusCode()==200)
    {
        HttpEntity entity = response.getEntity();
        String str=EntityUtils.toString(entity,"utf-8");
        System.out.println(str );
    }
}

}
