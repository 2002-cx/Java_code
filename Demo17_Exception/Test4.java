package Demo17_Exception;

public class Test4 {
    public static void main(String[] args) throws Exception {
        Student s= new Student();
        Student s1 = new Student(1,"a","asd");
        System.out.println(s1);
        s.setAge(17);
        s.setName("小张");
        s.setSex("aaa");
        System.out.println(s);
    }
}
