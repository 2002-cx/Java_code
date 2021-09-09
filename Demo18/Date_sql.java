package Demo18;

import java.sql.Date;

public class Date_sql {
    public static void main(String[] args) {
        Date d = new Date(123456L);
        System.out.println(d);
        /*

        java.sql.Date和java.util.Date区别
        1、
        java.util.Date有年、月、日、时、分、秒
        java.sql.Date只有年月日
        2、java.sql.Date和java.util.Date互相转换

         */
        //不知道类型是否为date类，所以报错，要转成date类new Date(123123123);
        //java.util.Date date = new java.util.Date();//创建util.Date对象,报错
        java.util.Date date = new Date(123456L);
        //util转到sql,向下转型
         Date date1 = (Date)date;
        //方式二，利用构造器
        Date date2 = new Date(date1.getTime());
        System.out.println(date2);

        //向上转型，sql类转成util类
        java.util.Date date3 = d;
        System.out.println(date3);

        //将字符串转为sql.Date
        Date date4 = Date.valueOf("2021-3-8");
    }
}
