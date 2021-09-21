package Generic_2;

//定义一个泛型类
public class Generic_c<T> {
    //用泛型表示声明一个成员变量
    //构造方法
    public Generic_c(){};//无参构造
    //带参构造
    public Generic_c(T t){
        this.t=t;
    }

    //get、set方法
    private T t;
    public void setT(T t){
        this.t = t;
    }
    public T getT(){
        return t;
    }

}
