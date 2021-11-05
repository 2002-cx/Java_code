package Map_;

import java.util.HashMap;
import java.util.Map;

public class test_1 {
    public static void main(String[] args) {
        /*
        Map集合
        增：put(K key,V value)
        删：clear() 、remove(Object key)
        改：
        查：entrySet()、get(Object key)、keySet() 、size()、values()

        判断：containsKey(Object key)、containsValue(Object value)、equals(Object o)、isEmpty()

         //特点：无序、唯一、按key
         */
        Map<String,Integer> m = new HashMap<>();
        m.put("zz",123);
        m.put("bb",1233);
        m.put("cc",1223);
        m.put("dd",1243);
        m.put("qq",12213);
        m.put("zz",1231);
        //System.out.println(m.remove("bb"));
        System.out.println(m.entrySet());
        System.out.println(m.isEmpty());
        System.out.println(m.size());
        System.out.println(m.containsKey("cc"));
        System.out.println(m.containsValue(1243));

        Map<String,Integer> m1 = new HashMap<>();
        m1.put("zz",123);
        m1.put("bb",1233);
        m1.put("cc",1223);
        m1.put("dd",1243);
        m1.put("qq",12213);
        m1.put("zz",1231);
        m1.put(null,12);
        System.out.println(m1.equals(m));//t
        System.out.println(m1 == m);//f

        System.out.println(m.keySet());
        System.out.println(m.values());
        for (String i:m.keySet()) {
            System.out.println(m.get(i));
        }
        System.out.println(m1.entrySet());

        //HashMap和HashTable差别
        /*
        HashMap中key可以为null、HashTable中Key不能为null
        LinkedHashMap有序，顺序为列表初始化的顺序，底层为链表
         */
    }
}
