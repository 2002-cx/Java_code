package Thread_;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class concurrentHashMap_ {
    public static void main(String[] args) {
        ConcurrentHashMap<String,String> hm = new ConcurrentHashMap();
        for (int i = 0; i <5 ; i++) {
            ExecutorService es = Executors.newFixedThreadPool(5);
            es.submit(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j <10 ; j++) {
                        hm.put(Thread.currentThread().getName()+"--->"+j,j+"");
                        System.out.println(hm);
                    }
                }
            });
            es.shutdown();
            while (!es.isTerminated()){}
            System.out.println("执行完毕");
        }
    }
}
