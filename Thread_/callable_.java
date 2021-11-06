package Thread_;

import java.util.concurrent.*;

public class callable_ implements Callable<Integer> {
    private String name;
    callable_(){}
    callable_(String name){
        this.name=name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    @Override
    public Integer call() throws Exception {
        Integer sum=0;
        Integer random = (int)((Math.random()*10)+1);
        System.out.println(this.getName()+":产生的随机数为:"+random);
        for (Integer i = 0; i <random ; i++) {
            sum+=i;
        }
        return sum;
    }
    //实现callable()接口有返回值


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        callable_ c1 = new callable_("线程1");
        callable_ c2 = new callable_("线程2");
        callable_ c3 = new callable_("线程3");
        ExecutorService es = Executors.newCachedThreadPool();
        Future<Integer> rs1= es.submit(c1);
        Future<Integer> rs2 = es.submit(c2);
        Future<Integer> rs3 = es.submit(c3);
        System.out.println(c1.getName()+"sum is:\t"+rs1.get());
        System.out.println(c2.getName()+"sum is:\t"+rs2.get());
        System.out.println(c3.getName()+"sum is:\t"+rs3.get());
        es.shutdown();
        while(!es.isTerminated()){}
        System.out.println("程序结束");
    }
}

