package Generic_3;

public class Son<E> extends Parents<E> {
//子类为E，在继承父类时，父类泛型类要和子类一致，所以父类也要由T改为E
    public Son(){
        super();
    };
    public Son(E e) {
        super(e);
    }
    public E getT(){
        return super.getT();
    }
}
