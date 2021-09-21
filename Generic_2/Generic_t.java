package Generic_2;

public class Generic_t {
    public static void main(String[] args) {
        //这里指定泛型标识为String类型，所以泛型类中的T都将被替换为String
        //泛型类在创建对象的时候来指定操作的具体类型·
        Generic_c<String> g_c = new Generic_c<String>();
        Generic_c<String> g_c1= new Generic_c<String>("a");
        String str=g_c1.getT();
        g_c.setT("b");
        String str1 = g_c.getT();
        System.out.println(str);
        System.out.println("------------------");
        System.out.println(str1);
        System.out.println("------------------");
        //泛型类在创建对象的时 候没有指定类型，将按照Object类型进行操作
        Generic_c g_c2 = new Generic_c("ABC");
        Object obj = g_c2.getT();
        System.out.println(obj);
        System.out.println("------------------");
        Generic_c<Double> g_c3 = new Generic_c<Double>(3.33);
        double d = g_c3.getT();
        //都是同一个类，即使类创建给的类型不同
        System.out.println(g_c2.getClass());//class Generic_2.Generic_c
        System.out.println("------------------");
        System.out.println(g_c3.getClass());//class Generic_2.Generic_c
        System.out.println("------------------");

        //true地址相同
        //同一泛型类、根据不同的数据类型创建的对象，本质上是同一类型
        System.out.println(g_c2.getClass()==g_c3.getClass());

        //泛型类注意事项：
        /*
        1、泛型类、如果没有指定具体的数据类型，此时，操作类型是Object
        2、泛型的类型参数只能是引用数据类型，不能是基本数据类型
        3、泛型类在逻辑上可以堪称是多个不同的类型，但实际上是相同的类型
        */
    }
}
