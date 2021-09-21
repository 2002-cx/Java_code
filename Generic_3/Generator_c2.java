package Generic_3;

//在原接口上，实现类可以对泛型进行扩充
//泛型接口的实现类是一个泛型类，要保证实现接口的泛型类的泛型标志包含泛型接口的泛型标识
public class Generator_c2<T,E> implements Generator_i<T>{
    private T t ;
    private E a;

    public Generator_c2(){};//空参
    public Generator_c2(T i, E s) {
        t=i;
        a=s;
    }

    public E getA(){
        return a;
    };
    public void setA(E e){
        a=e;
    }
    public void setT(T b){
        t=b;
    }
    public T getT(){
        return t;
    };
}
