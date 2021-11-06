package Thread_;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class thread_poor {
    public static void main(String[] args) {
        //线程池
        //1、创建一个固定数量的线程池对象
//        ExecutorService es = Executors.newFixedThreadPool(3);
//
//        //传统做法
////        Thread t1 = new Thread(mt);
////        Thread t2 = new Thread(mt);
////        Thread t3 = new Thread(mt);
////        t1.start();
////        t2.start();
////        t3.start();
//
//
//        //利用线程池的做法
//        mythread mt = new mythread();
//        es.submit(mt);
//        es.submit(mt);
//        es.submit(mt);


        //2、创建一个包含单条线程的线程池,线程池中只有一个线程
//        ExecutorService es2 = Executors.newSingleThreadExecutor();
//        mythread mt = new mythread();
//        es2.submit(mt);
//        es2.submit(mt);
//        es2.submit(mt);

        //2、创建一个固定长度的线程池，而且以延迟或定时方式执行，类似Timer
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(2);
        mythread mt = new mythread();
        for (int i = 0; i <4 ; i++) {
            ses.schedule(mt,1, TimeUnit.SECONDS);//每个任务延迟1秒执行
        }
        ses.shutdown();//执行后关闭线程池，一般不关闭
        while(!ses.isTerminated()){
            //isTerminated()判断程序是否终止
        }
        System.out.println("程序执行完毕");
        //3、创建一个带缓冲区的线程池、可伸缩，会根据需求创建线程
//        ExecutorService es = Executors.newCachedThreadPool();
//        mythread mt = new mythread();
//        es.submit(mt);
//        es.submit(mt);
//        es.submit(mt);
//        es.submit(mt);
//        es.submit(mt);
//        es.submit(mt);
//
//        //关闭线程池，一般不做
//        es.shutdown();
    }

}

class mythread implements Runnable{


    @Override
    public void run() {
        System.out.println("我要一个教练！");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("教练来了:"+Thread.currentThread().getName());
        System.out.println("教完后又回到了泳池！");
    }
}
