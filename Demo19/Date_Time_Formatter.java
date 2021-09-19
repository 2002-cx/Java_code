package Demo19;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

public class Date_Time_Formatter {
    //格式化类：DateTimeFormatter
    public static void main(String[] args) {
        //方法1、预定义标准格式。如ISO_LOCAL_DATE_TIME;ISO_LOCAL_DATE;ISO_LOCAL_TIME;
        DateTimeFormatter s = DateTimeFormatter.ISO_DATE;
        LocalDateTime l = LocalDateTime.now();
        //LocalDateTime-->String
        String s1 = s.format(l);
        System.out.println(s1);
        //String-->LocalDateTime
        TemporalAccessor parse =  s.parse(s1);
        System.out.println(parse);

        //方法2、本地化相关的格式：如ofLocalizedDateTime()
        //参数：FormatStyle.LONG/FormatStyle.MEDIUM/FormatStyle.SHORT
        //LocalDateTime-->String
        DateTimeFormatter df = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        //参数为LONG-->2021年9月19日 下午12时39分35秒
        //参数为MEDIUM-->2021-9-19 12:40:29
        //SHORT-->21-9-19 下午12:40
        LocalDateTime now1 =LocalDateTime.now();
        String str = df.format(now1);
        System.out.println(str);

        //String--->LocalDateTime
        TemporalAccessor parse1 = df.parse(str);
        System.out.println(parse1);

        //方法3、自定义格式：
        //例：ofPattern("yyyy-MM-dd hh:mm:ss");重点，常用
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("2021-02-30 03:03:33");
        LocalDateTime d2 = LocalDateTime.now();
        String str2 = df2.format(d2);
        System.out.println(str2);
        //将字符串转成LocalDateTime
        TemporalAccessor parse3 = df2.parse(str2);
        System.out.println(parse3);
    }
}
