package Map_;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class test_3 {
    public static void main(String[] args) {
        //利用外部比较器
        Map<Student,Integer> m = new TreeMap(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }

                  });
        m.put(new Student(12,"abcb",123.2),1232);
        m.put(new Student(122,"cbcb",123.2),1223);
        m.put(new Student(132,"dbb",123.2),2123);
        m.put(new Student(142,"ebb",123.2),12334);
        m.put(new Student(112,"fbb",123.2),12343);
        System.out.println(m);
        //直接使用自定义类型会报错，因为TreeMap集合是升序排列的，而自定义类型中没有重定义compare方法

        //哈希表=数组+链表
    }
}
