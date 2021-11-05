package Map_;

import java.util.Map;
import java.util.TreeMap;

public class test_2 {
    public static void main(String[] args) {
        //TreeMap特点:升序、唯一
        Map<String,Integer> m = new TreeMap<>();
        m.put("baa",12);
        m.put("baa",12);
        m.put("aaa",12);
        m.put("caa",12);
        m.put("daa",12);
        m.put("eaa",12);
        System.out.println(m.entrySet());
        System.out.println(m.size());

    }
}
