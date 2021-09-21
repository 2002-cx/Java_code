package Generic_3;

public class Test {
    public static void main(String[] args) {
        Son<String> s = new Son<String>("abc");
        String str = s.getT();
        System.out.println(str);
        System.out.println("--------");
        //子类没有使用泛型类、此时就会当作普通类来进行处理
        Son_one s1 = new Son_one();
        s1.setT(1);
        int a = s1.getT();
        System.out.println(a);
    }
}
