package Generic_2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Generic_c1<Integer> g_c1 = new Generic_c1<Integer>();
        ArrayList<String> list = new ArrayList<String>();
        list.add("鄙视");
        list.add("丑哼");
        list.add("磨叽");
        String str = g_c1.method(list);
        System.out.println(str+"\t"+str.getClass().getSimpleName());
        System.out.println("---------------------");
        ArrayList<Integer> i_list = new ArrayList<Integer>();
        i_list.add(1000);
        i_list.add(2000);
        i_list.add(3000);
        Integer i = g_c1.method(i_list);
        System.out.println(i+"\t"+i.getClass().getSimpleName());

    }
}
