package Demo2;

import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

public class str {
    public static void main(String[] args) throws IOException {
        //Jsoup使用工具类读取文件，获取字符串
        String str = FileUtils.readFileToString(new File("C:\\Users\\mo_chen\\Desktop\\2002572陈鑫.html"),"utf-8");
        Document doc = Jsoup.parse(str);
        //查看p标签的内容
        String title = doc.getElementsByTag("p").text();
        System.out.println(title);
    }
}
