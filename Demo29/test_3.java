package Demo29;

import java.util.Comparator;

public class test_3 {
    public static void main(String[] args) {
        //比较int类型大小
//        System.out.print("请输入两个数:");
//        Scanner s= new Scanner(System.in);
//        int x,y;
//        x=s.nextInt();
//        y=s.nextInt();
//        int poor=x-y;
//        if(poor==0)
//        {
//            System.out.println("相等");
//        }
//        else if(poor>0)
//        {
//            System.out.printf("x:"+x+"大");
//        }
//        else{
//            System.out.printf("y:"+y+"大");
//        }

        //比较两个字符串大小:compareTo()方法，判断返回的int数是><=0
//        String a = "C";
//        String b = "B";
//        int result = a.compareTo(b);
//        if(result>0)
//        {
//            System.out.println(a+"大");
//        }
//        else if(result==0){
//            System.out.println("相等");
//        }
//        else{
//            System.out.println(b+"大");
//        }


        //比较double类型数据
//        double d1=32.3;
//        double d2= 323.23;
//        System.out.println(d1 > d2 ? d1 : d2);
//        System.out.println(((Double) d1).compareTo((Double) d2));
//

        //比较自定义数据类型
        Person p1 = new Person(12,123.3,"张三");
        Person p2 = new Person(12,1223.3,"张w三");
        System.out.println((p1.compareTo(p2)));

        //利用外部比较器进行比较
        //接口来接也行
        Comparator c = new Person.compare_();
        System.out.println(c.compare(p1, p2));

        //外部比较器和内部比较器谁好？
        //外部比较器，因为外部比较器利用多态，扩展性好
    }
}
