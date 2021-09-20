package Generic;

public class Test {
    public static void main(String[] args) {
        Demo_type_c d = new Demo_type_c();
        //如果定义了泛型、没有使用，则泛型中的形参相当于Object
        d.setE(1);
        d.setT("b");
        Object obj = d.getE();//因为声明类时没有使用泛型，所以默认为Object类
        System.out.println(obj);
        //实例化泛型
        Demo_type_c<String,Integer> d1 = new Demo_type_c<String,Integer>();
        d1.setT("1");
        d1.setE(1);
        String str = d1.getT();
        Integer i_t = d1.getE();
        System.out.println(str);
        System.out.println(i_t);
    }
}
