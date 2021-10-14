package Enum;

public class t {
    public static void main(String[] args) {
        //使用自定义枚举类
        Season summer = Season.Autumn;
        System.out.println(summer.toString());
        System.out.println(Season.class.getSuperclass().getName());
        //使用java中的枚举类
        System.out.println(Season_.Spring.toString());
        Season_ spring = Season_.Spring;
        System.out.println(spring.toString());
        System.out.println(Season_.class.getSuperclass().getName().toString());
    }
}
