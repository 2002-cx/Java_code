package ttt;

public class c_test {
    public static void main(String[] args) {
        i_t i = new i_c();//运用多态
        c_proxy cProxy1 =new c_proxy((i_c) i);
        i_t t = (i_t) cProxy1.getProxyInstance();
        t.run();
        System.out.println("---------------------");
        t.info();
    }
}
