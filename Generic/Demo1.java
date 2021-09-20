package Generic;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        //集合、可以存放各种引用数据类型
        //泛型：可以限制特定的一种类型
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);
        //泛型：将list1集合限制为String类型
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("asd");
        list1.add("qwe");
        for (String str: list1
             ) {
            System.out.println(str);
        }
        System.out.println(list1.get(0));
    }
}
