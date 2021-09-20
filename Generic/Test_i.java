package Generic;

public class Test_i<E,T> implements GenericInter_i<E,T>{
    //泛型接口使用
    //没有明确泛型，由Test_i来实现
    public void method(E e){}

    @Override
    public void method2(T t) {

    }


}
class Test_i1<String> implements GenericInter_i<String,String>{
    //明确类型
    public void method(String e){}

    @Override
    public void method2(String t) {

    }


}

