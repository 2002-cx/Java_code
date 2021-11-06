package Thread_;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class lock {
    public static void main(String[] args) throws InterruptedException {
        mylist ml = new mylist();
        //匿名内部类
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                ml.add_("hello");
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                ml.add_("world");
            }
        };
        String[] strarr = ml.list_();
        Thread t1 = new Thread(r1,"线程A");
        Thread t2 = new Thread(r2,"线程B");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        for (String str:strarr) {
            System.out.println("str:"+str);
        }


    }
}

class mylist{
    private  String stral[]={"1","2","3","",""};
    private  int index=3;
    private Lock lock=new ReentrantLock();
    public void add_(String str){
        //线程安全问题解决方法1、加一个synchronized方法
        //public synchronized void add_(String str){
        //2、加一个lock锁
        lock.lock();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();//用完之后要解锁，如果出现异常之后没解锁则会出现异常
            //所以必须要解锁，所以用finally，即使出现异常也要解锁
        }
        stral[index]=str;
        index++;
        System.out.println(Thread.currentThread().getName()+"添加了"+str);


    }

    public String[] list_(){
        return stral;
    }

    @Override
    public String toString() {
        return "mylist{" +
                "stral=" + Arrays.toString(stral) +
                ", index=" + index +
                '}';
    }
}
