package Demo17;

public class Test2 {
    public static void main(String[] args) {
        int x=1,y=1;

       //普通的int    ==比较的是两个值是否相等
        System.out.println(x==y);//true
        Integer a =new Integer(1);
        Integer b = new Integer(1);
        System.out.println(a==b);//false---Integer类型的== 表示的地址是否相同
        System.out.println(a.equals(b));//true  Integer对equals重写比较的是两个值是否相同
        //Integer对象通过自动装箱获取
        Integer a1 =1232,a2=1232;
        System.out.println(a1.equals(a2));//true
        System.out.println(a1==a2);//a1=12,a2=12时返回的是true，a1=1232,a2=1232返回的是false
        System.out.println();
        /*
         if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new Integer(i);
         low=-127  high=127;
         */
        int aa = a1.intValue();
        System.out.println(aa);
    }
}
