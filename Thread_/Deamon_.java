package Thread_;

public class Deamon_ implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+'\t'+i);
        }
    }
//守护线程，主线程执行结束，其余线程也会跟着挂
public static void main(String[] args) {
    Deamon_ d = new Deamon_();
    Thread t = new Thread(d,"线程1");
    t.setDaemon(true);//设置为守护线程
    t.start();
    for (int i = 0; i <29 ; i++) {
        System.out.println(Thread.currentThread().getName()+'\t'+i);
    }
}
}
