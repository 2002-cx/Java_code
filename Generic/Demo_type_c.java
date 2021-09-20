package Generic;

/*
泛型类的定义
泛型试试加在类名后面的
<>里面的东西是泛型的类型
T：参数_形参 ，名称只要遵循java命名规范即可，可以定义多个泛型
 多个泛型形参用，隔开
 */
public class Demo_type_c<T,E> {
    //成员·变量
    T t;//定义成员变量
    E e;
    //生成类型对象的get、set方法
    public T getT(){
        return t;
    }
    public void setT(T t){
        this.t = t;
    }

    public E getE(){
        return e;
    }
    public void setE(E e ){
        this.e=e;
    }
}
