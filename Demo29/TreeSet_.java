package Demo29;

import java.util.TreeSet;

public class TreeSet_ {
    public static void main(String[] args) {
        //TreeSet()方法
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(90);
        ts.add(15);
        ts.add(1123);
        ts.add(1);
        ts.add(12);
        ts.add(123);
        ts.add(12);
        System.out.println(ts.size());//6
        System.out.println(ts);//[1, 12, 15, 90, 123, 1123]
        //TreeSet()特点，升序、不重复

        //字符串比较特点
        TreeSet<String> tss = new TreeSet<>();
        tss.add("cll");
        tss.add("all");
        tss.add("bll");
        tss.add("all");
        tss.add("pll");
        tss.add("dll");
        System.out.println(tss);
        System.out.println(tss.size());

        //泛型为自定义类型
        TreeSet<Teacher> tst = new TreeSet<>();
        Teacher t = new Teacher(12,"zzzzz");
        Teacher t1 = new Teacher(13,"bzzzz");
        Teacher t2 = new Teacher(133,"czzzz");
        Teacher t3 = new Teacher(14,"azzzz");
        Teacher t4 = new Teacher(12,"ezzzz");
        Teacher t5 = new Teacher(15,"bzzzz");
        //特点：根据刚刚设置的compareTo()为年龄进行比较，所以重复的没有，升序
        tst.add(t);
        tst.add(t1);
        tst.add(t2);
        tst.add(t3);
        tst.add(t4);
        tst.add(t5);
        System.out.println(t.compareTo(t1));
        System.out.println("大小："+tst.size());
        System.out.println(tst);

    }
}
