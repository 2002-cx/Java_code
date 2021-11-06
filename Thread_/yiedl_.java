package Thread_;

public class yiedl_ {

    public static void main(String[] args) {
//        taskA ta = new taskA();
//        taskB tb = new taskB();
//        Thread tt1 = new Thread(ta,"TA");
//        Thread tt2 = new Thread(tb,"TB");
//        tt1.start();
//        tt2.start();
        new Thread(new taskA(),"a").start();
        new Thread(new taskB(),"b").start();
    }

}

class taskA implements Runnable{

    @Override
    public void run() {
//        Thread.yield();
        //或者
        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i <50 ; i++) {
            System.out.println(Thread.currentThread().getName()+"\t"+i);
        }
    }
}


class taskB implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <50 ; i++) {
            System.out.println(Thread.currentThread().getName()+"\t"+i);
        }
    }
}