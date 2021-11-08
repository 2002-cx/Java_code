package Demo2;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;

public class jsoup_ {
    public static void main(String[] args) throws IOException {
        //Jsoup解析html文本和url地址
        /*
        1、从一个URL，文件或字符串中解析HTML
        2、使用DOM或CSS选择器来查找、取出数据
        3、可操作HTML元素、属性、文本

        根据id查询元素：getElementById
        根据标签查询元素:getElementByTag
        根据class获取元素:getElementByClass
        根据属性获取元素:getElementByAttribute
         */
        //解析URL地址，第一个参数是访问的url，第二个参数是访问时候的超时时间
        Document document = Jsoup.parse(new URL("http://www.itcast.cn"),1000);
        //使用标签选择器，获取tittle标签中的内容
        String str = document.getElementsByTag("title").first().text();
        System.out.println(str);
    }
}
