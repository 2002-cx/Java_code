package Generic;

public class Generic_method {

    //泛型方法的泛型是加在返回值类型前面
    public <T,E>void method(T t , E e){
        System.out.println(t);
        System.out.println(e);
    }
}
