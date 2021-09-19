package Demo21;

public class String_memory {
    public static void main(String[] args) {
        String str1 = "a"+"b"+"c";
        String str2 = "abc";
        String str3 = new String("abc");
        //str1、str2都是在方法区中字符串常量池中开辟的空间
        //而str3是在堆中开辟的空间，而==比较的是值和地址是否相同
        //str1、str2都是同一块内存空间，所以值、地址相同
        //str3是在堆中开辟的空间，所以不同·
        System.out.println(str1==str2);//t
        System.out.println(str2==str3);//f
        //StringBuilder
        StringBuilder sb = new StringBuilder("abc");
        //链式调用方法
        System.out.println(sb.append("def").append("hijk").append("mnpq").append("dd").toString());
    }
}
