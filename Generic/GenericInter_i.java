package Generic;

public interface GenericInter_i<T,E> {
    // T t;接口中不能·这样定义
    //接口中变量全是由public static final修饰的，并且要明确给出值
    //接口中所有方法全是由public abstract修饰
    //接口中泛型的形参都是出现在方法中
    //泛型接口定义
    public abstract void method(T t);
    public abstract void method2(E e);
}
