package Generic_2;

import java.util.ArrayList;
import java.util.Random;

public class Generic_c1<T> {
    //泛型类的使用
    //奖品
    private T product;
    Random r = new Random();
    public Generic_c1(){};//无参构造
    //带参构造
    public Generic_c1(T t){
        product=t;
    }

    //定义一个泛型集合
    //奖品集合
    ArrayList<T> a_list = new ArrayList<T>();

    //设置一个添加奖品的方法
    public void addProduct(T t){
        a_list.add(t);
    }

    //获得奖品方法
    public T getProduct(){
       product=  a_list.get(r.nextInt(a_list.size()));
       return product;
    }
    //泛型方法
    public <T> T method(ArrayList<T> i_list){
        return i_list.get(r.nextInt(i_list.size()));
    }
}
