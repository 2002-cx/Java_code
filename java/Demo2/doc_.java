package Demo2;

import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

public class doc_ {
    public static void main(String[] args) throws IOException {
        //根据id获取元素
        String str = FileUtils.readFileToString(new File("C:\\Users\\mo_chen\\Desktop\\2002572陈鑫.html"));
        Document doc = Jsoup.parse(str);
        String str1 = doc.getElementById("bottom").text();
        System.out.println(str1);
    }
}
