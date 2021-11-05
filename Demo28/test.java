package Demo28;

public class test {

    public static void main(String[] args) {
        MyLinkedlist ml = new MyLinkedlist();
        ml.add("a");
        ml.add("b");
        ml.add("c");
        ml.add("d");
        System.out.println(ml.getCount());
        System.out.println(ml.get(2));
    }}
