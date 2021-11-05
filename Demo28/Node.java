package Demo28;

public class Node {
    //上一个元素地址
    private Node Before;
    //当前存入的元素的地址
    private Object Obj;
    //下一个元素的地址
    private Node Next;

    @Override
    public String toString() {
        return "Node{" +
                "Before=" + Before +
                ", Obj=" + Obj +
                ", Next=" + Next +
                '}';
    }

    public Node getBefore() {
        return Before;
    }

    public void setBefore(Node before) {
        Before = before;
    }

    public Object getObj() {
        return Obj;
    }

    public void setObj(Object obj) {
        Obj = obj;
    }

    public Node getNext() {
        return Next;
    }

    public void setNext(Node next) {
        Next = next;
    }
}
