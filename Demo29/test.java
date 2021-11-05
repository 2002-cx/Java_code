package Demo29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class test {
    //ListIterator接口
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        ListIterator listIterator = list.listIterator();
        Iterator<String> it = list.iterator();
        while(listIterator.hasNext()){
            if("d".equals(listIterator.next())){
                //ConcurrentModificationException：并发修改异常
                //add()方法和Iterator迭代器同时修改集合，导致并发异常
                //解决方法，引入ListIterator
                listIterator.add("pp");
                System.out.println(list);
                }

        }
//        for (int i = 0; i <list.size() ; i++) {
//            System.out.println(list.get(i));
//        }
        //查看上面是否存在元素：
        System.out.println("上面是否存在元素:"+listIterator.hasPrevious());
        //查看下面是否存在元素
        System.out.println("下面是否存在元素:"+listIterator.hasNext());

    }
}
