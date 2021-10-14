package Enum_2;

public class test {
    public static void main(String[] args) {
        Season s= Season.AUTUMN;
        System.out.println(s.toString());
        //枚举关键字
        //valueof();对象的名字必须传准确,否则抛出异常
        System.out.println(Season.valueOf("SPRING"));
        Season[] s1 = Season.values();
        System.out.println("------------");
        //遍历枚举类中的每一个对象
        for(Season ss:s1){
            System.out.println(ss.toString());
        }
    }

}
