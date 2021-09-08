package Demo17;

public class Test1 {
    public static void main(String[] args) {

        //属性
        System.out.println("Max:"+Integer.MAX_VALUE);
        System.out.println("Min"+Integer.MIN_VALUE);
        //物极必反
        System.out.println("Max:"+(Integer.MAX_VALUE+1));
        System.out.println("Min:"+(Integer.MIN_VALUE-1));


        //构造器
        int a = Integer.valueOf(1);
        System.out.println(a);
        int b = Integer.valueOf("1234");//将字符串数转为int类型
        System.out.println((a+b));

        //自动装箱
        Integer i = 12;
        System.out.println(i);//12---将int类型的数直接转换为Integer类型--自动装箱
        //自动拆箱

        Integer _i = new Integer(1);
        int iii =  _i;

        System.out.println(iii);//1--将_i——integer类型转换为int类型，自动拆箱
        //compareTo:只返回三个值：-1、0、1
        int t=i.compareTo(_i);//return (x < y) ? -1 : ((x == y) ? 0 : 1);
        System.out.println(t);


    }
}
