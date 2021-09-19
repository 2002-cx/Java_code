package Demo20;

import java.util.Random;

public class Random_ {
    public static void main(String[] args) {
        //Random类
        //1、利用带参的构造器创建对象
        Random r = new Random(System.currentTimeMillis());
        int a = (int)(r.nextInt());
        System.out.println(Math.abs(a));
        //2、利用空参构造器--表面调用无参构造器，实则无参内部调用的是有参构造器
        Random r1 = new Random();
        int b = r1.nextInt(10);//返回[0-bound)之间的数
        System.out.println(b);
    }
}
