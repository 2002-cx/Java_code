package Demo29;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class test_2 {
    public static void main(String[] args) {
        //List接口：不唯一、有序
        //Set接口：唯一，无序
        //遍历方式：迭代器、增强for循环
       //具体实现类1、HashSet
        HashSet<Integer> hs = new HashSet<>();
        System.out.println(hs.add(12));//返回结果为true，所以存放的为这个12
        hs.add(13);
        System.out.println(hs.add(12));
        hs.add(1212);
        hs.add(10);
        hs.add(0);
        System.out.println(hs);
        //Set接口：唯一，无序
        //所以重复的12就不算、并且输出出来的顺序也是乱的
        System.out.println("集合长度为:"+hs.size());

        //LinkedHashSet()方法得到的元素是有序的、就是在HashSet()基础上多了一个链表，将放入的元素串在一起
        //LinkedHashSet():特点：唯一，有序
        LinkedHashSet<String> lhs =new LinkedHashSet<>();
        lhs.add("a");
        lhs.add("b");
        lhs.add("c");
        lhs.add("d");
        lhs.add("e");
        lhs.add("a");
        System.out.println(lhs);
    }
}
