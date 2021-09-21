package Generic_3;

public class Test_g {
    public static void main(String[] args) {
        //实现类不是泛型，实现类的接口为泛型，则具体使用时new实例化时就是普通类
        Generator_c g = new Generator_c();
        System.out.println(g.getT());
        System.out.println("-----------");
        Generator_c2<String,Integer> g_c2 = new Generator_c2<String,Integer>();
        Generator_c2<Integer,String> g_c3 = new Generator_c2<Integer, String>(1,"2");
        g_c2.setA(12);
        g_c2.setT("Hello world");
        Integer i_ = g_c2.getA();
        String str = g_c2.getT();
        System.out.println(i_);
        System.out.println(str);
        System.out.println("----带参------");
        System.out.println(g_c3.getA());
        System.out.println(g_c3.getT());
        System.out.println(g_c3.getClass()==g_c2.getClass());

    }
}
