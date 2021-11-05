package Thread_;
/*
线程不安全条件：
1、多线程
2、有写权限
3、共享资源：本案例中tickets为共享资源，多个线程都可做修改

 本案例中如果没有synchronized()内部锁方法的话，则线程不安全
 1、）会导致tickets一票多卖
 2、）会导致卖到负数
 */
//extends Thread法1、防止多并发
//public class thread_ extends Thread{
//    private static int tickets=100;//为共享资源
//    public void run(){
//        while(true){
//            //防止多并发
//            synchronized(thread_.class){
//          在该代码块区中为互斥区
//                if(tickets>0)
//                {
//                    try {
//                        Thread.sleep(20);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName()+"\t"+tickets--);
//
//                }
//            }
//
//        }
//    }
//    public static void main(String[] args) {
//        thread_ t1 = new thread_();
//        Thread tt1 = new Thread(t1);
//        Thread tt2 = new Thread(t1);
//        Thread tt3 = new Thread(t1);
//        Thread tt4 = new Thread(t1);
//        tt1.start();
//        tt2.start();
//        tt3.start();
//        tt4.start();
//    }
//}

//extends Thread法2、
//
//public class thread_ extends Thread{
//
//    private int tickets = 100;
//    public void run(){
//        while (true){
//            synchronized(this){
//                //syschronized()中的参数可以为this、.class、new Object()
//                //this指的是调用该run的当前对象
//                //主函数中调用的对象为thread_ t = new thread_();
//                /*
//                thread_ t1 = new thread_();
//                thread_ t2= new thread_();
//                thread_ t3 = new thread_();
//                thread_ t4 = new thread_();
//                t1.start()
//                t2.start()
//                t3.start()
//                t4.start()
//                这样就调用了多个对象了，所以synchronized()并没有锁住，因为调用的多个对象是互不影响的
//
//                 */
//                if(tickets>0)
//                {
//                    try {
//                        Thread.sleep(50);
//                        System.out.println(Thread.currentThread().getName()+"\t"+tickets--);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//
//                }
//            }
//
//        }
//    }
//    public static void main(String[] args) {
//        thread_ t = new thread_();
//        Thread tt1 = new Thread(t);
//        Thread tt2 = new Thread(t);
//        Thread tt3 = new Thread(t);
//        Thread tt4 = new Thread(t);
//
//        tt2.start();
//        tt1.start();
//        tt3.start();
//        tt4.start();
//
//
//    }
//}

//法3、implements Thread
public class thread_ extends Thread {

    private int tickets =100;
    public void run(){
        while (true){
            synchronized (this){
                if(tickets>0)
                {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"\t"+tickets--);
                }
                else{
                    break;
                }

            }

        }
    }
    public static void main(String[] args) {
        thread_ t =new thread_();
        Thread tt1 = new Thread(t);
        Thread tt2 = new Thread(t);
        Thread tt3 = new Thread(t);
        Thread tt4 = new Thread(t);
        tt1.start();
        tt2.start();
        tt3.start();
        tt4.start();
    }
}