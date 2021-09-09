package Demo18;

import java.util.Date;

public class Date_util {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.toGMTString());//格林时间，中国慢了七小时
        System.out.println(d.toString());
        System.out.println(d.toLocaleString());
        System.out.println(d.getYear());//121,因为是从1900年开始的，+121=2021
        System.out.println(d.getMonth());//8,月份是从0到11
        System.out.println(d.getTime());//1900到现在过去了多少毫秒
        System.out.println(System.currentTimeMillis());//1900到现在过去了多少毫秒
        //getTime()和System.currentTimeMillis()谁更好？
        //System.currentTimeMillis()更好，因为它是static修饰的，可以直接类名.方法名调用
        //而getTime()使用必须要先创建个对象，new实例化才能用
        //public static native long currentTimeMillis();
        //native---本地方法
        //为什么没有方法体？因为这个方法的具体实现可能不是通过java写的

        long start_time = System.currentTimeMillis();
        int i;
        for (i = 0; i <100000 ; i++) {
            i++;
        }
        System.out.println(i);
        long end_time = System.currentTimeMillis();
        System.out.println("用时:"+(end_time-start_time)+"毫秒");
    }
}
