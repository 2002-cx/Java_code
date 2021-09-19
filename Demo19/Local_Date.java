package Demo19;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Local_Date {
    public static void main(String[] args) {
        //1、完成实例化
        //2、java中提供完成实例化方法now(),获取当前日期、时间、日期+时间
        LocalDate localdate = LocalDate.now();
        System.out.println(localdate);//2021-09-19
        LocalDateTime localDatetime = LocalDateTime.now();
        System.out.println(localDatetime);//2021-09-19T11:21:56.388
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);//11:21:30.889
        //方法2、of()--设置当前日期、时间、日期加时间
        LocalTime of1 = LocalTime.of(11,20,30);//
        LocalDate of2 = LocalDate.of(2021,3,5);
        LocalDateTime of3 = LocalDateTime.of(2021,3,3,4,4,3,3);
        System.out.println(of1);
        //LocalDate、LocalTime用得没LocalDateTime多
        //get方法
        System.out.println(localDatetime.getYear());
        System.out.println(localDatetime.getDayOfMonth());
        System.out.println(localDatetime.getDayOfWeek());
        //不是set方法，with方法
        //不可变性，改了值之后只会是赋给新的变量为改了之后的值，原来的年月日不会改变
        LocalDateTime localdatetime = localDatetime.withYear(2020);
        System.out.println(localdatetime.getYear());//2020
        System.out.println(localDatetime.getYear());//2021
        //提供了加、减操作
        //加
        LocalDateTime l = localdatetime.plusYears(20);
        System.out.println(l);
        //减
        LocalDateTime l1 = l.minusYears(19);
        System.out.println(l1);
    }
}
