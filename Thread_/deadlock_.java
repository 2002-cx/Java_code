package Thread_;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class deadlock_ {
    private static Lock lock1 = new ReentrantLock();
    private static Lock lock2 = new ReentrantLock();
    public static void main(String[] args) {
        //死锁
         Thread t1 =new Thread(new Runnable() {
             @Override
             public void run() {
                 synchronized(lock1){
                     System.out.println(Thread.currentThread().getName()+"\t拿到了锁1,资源1");
                     try {
                         Thread.sleep(1000);
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                     System.out.println("等待锁2、资源2");
                     synchronized (lock2){
                         System.out.println(Thread.currentThread().getName()+"\t拿到了锁2、资源2");
                     }
                 }

             }
         });

         Thread t2=new Thread(new Runnable() {
             @Override
             public void run() {
                 synchronized (lock1)
                 {
                     System.out.println(Thread.currentThread().getName()+"\t拿到了锁2，资源2");
                     try {
                         Thread.sleep(1000);
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                 }
                 System.out.println("等待锁1、资源1");
                 synchronized (lock2)
                 {
                     System.out.println(Thread.currentThread().getName()+"\t拿到了锁1，资源1");
                 }

             }
         });

         t1.start();
         t2.start();
    }
}
