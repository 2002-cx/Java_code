package Thread_;

import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CopyOnWriteaArraylist_{
    public static void main(String[] args) {

        //出于代码安全性考虑，这里集合用ArrayList，线程有些会存入null，所以不安全

        /*
        所以采用CopyOnWriteArrayList<>
        1、线程安全的ArrayList，加强版读写分离
        2、写有锁、读无锁、读写之间不阻塞、优于读写锁
        3、写入时、先copy一个容器副本、再添加新元素、最后替换引用
        4、使用方法与ArrayList无异
         */
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        //创建线程
        ExecutorService es = Executors.newFixedThreadPool(5);
        for (int i = 0; i <5 ; i++) {
            es.submit(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i <10 ; i++) {
                        list.add("content:"+new Random().nextInt(100));
                    }
                }
            });
        }
        es.shutdown();
        while(!es.isTerminated()){}
        System.out.println("大小："+list.size());
        for (String i:list) {
            System.out.println(i);
        }
        System.out.println("执行完毕");
    }


}
