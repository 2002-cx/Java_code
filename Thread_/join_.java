package Thread_;

public class join_ extends Thread{
    public static void main(String[] args) throws InterruptedException {
        join_ j = new join_();
        j.start();
        System.out.println(Thread.currentThread().getName());
        j.join();
        System.out.println(Thread.currentThread().getName());
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i <20 ; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
