package Demo29;

import java.util.HashSet;

public class test_student {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();

        //在HashSet集合中为自定义类型的数据类型，在该类型中必须重写HashCode()和equals()方法，否则乱序、不唯一
        //HashSet在自定义类型中，集合乱序，但不唯一
        //在Student类中重写HashCode()、equals()方法则乱序，唯一
        System.out.println(hs.add(new Student(12, "张三")));
        hs.add(new Student(13,"张三"));
        hs.add(new Student(12,"王麻子"));
        hs.add(new Student(15,"王五"));
        hs.add(new Student(123,"涨涨"));
        System.out.println(hs.add(new Student(12, "张三")));
        System.out.println(hs);
        System.out.println("大小:"+hs.size());
        //底层原理:数组加链表
    }
}
