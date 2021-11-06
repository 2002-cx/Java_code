package Thread_;

public class wait_notify_ {
    private int customer;//50个顾客
    private int i;
    public wait_notify_(int customer,int i) {
        this.customer = customer;
        this.i=i;
    }

    public static void main(String[] args) {
        wait_notify_ wn = new wait_notify_(50,1);
        //等待和唤醒线程
        Object lock = new Object();
        new Thread(new Runnable() {

            @Override
            public void run() {

                while (true){
                    if(wn.customer>0){
                        wn.customer--;
                        System.out.println("第"+(wn.i)+"个人来买早餐！");
                        //进入等待，等待老板把早餐做好
                        synchronized (lock){
                            try {
                                //等待唤醒方法的唤醒
                                lock.wait(400);//如果在设定时间内没有被唤醒，则会自己醒
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            System.out.println("第"+(wn.i)+"个人开始吃早餐");
                            wn.i++;

                        }
                    }
                    else{
                        break;
                    }

                }


            }
        },"顾客线程").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    if(wn.customer>0)
                    {
                        try {
                            Thread.sleep(2*10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("第"+wn.i+"份早餐做好了");//早餐做好了，唤醒顾客来拿
                        synchronized(lock){
                            lock.notify();
                        }
                    }
                    else{
                        break;
                    }

                }

            }
        },"老板线程").start();
    }
}
