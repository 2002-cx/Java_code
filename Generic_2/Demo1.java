package Generic_2;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {

        ArrayList<String> strlist = new ArrayList<String>();
        //泛型好处1、
        //在编译期间就会检查是否传入的对象是否是泛型所限制的类型
        //2、减少了数据类型转换
        strlist.add("a");
        strlist.add("b");
        strlist.add("c");
        for (int i = 0; i <strlist.size() ; i++) {
            System.out.println(strlist.get(i));
        }
        method_f(30);
        ArrayList<Integer> i_list = new ArrayList<Integer>();
        for (int i = 0; i <5 ; i++) {
            i_list.add((i)+1);
        }
        for (int i = 0; i <i_list.size() ; i++) {
            int num = i_list.get(i);//自动拆箱，将Integer类型转换为int类型
            System.out.println(num);
        }
        method_f(30);
        for (Integer int_:i_list) {
            System.out.println(int_);
        }

    }
    public static void method_f(int num){
        for (int i = 0; i <num ; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
