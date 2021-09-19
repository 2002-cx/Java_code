package Demo20;
//package java.lang;
//直接使用，无需导包
public class Math_ {
    //常用方法
    public static void main(String[] args) {
        //因为Math中所有方法和属性都是static修饰的，所以可以直接类名.方法名或类名.属性名进行调用
        System.out.println("次方:"+Math.pow(2, 3));
        System.out.println("随机数:"+(int)(Math.random()*10)+1);
        System.out.println("向上取整:"+Math.ceil(3.1));
        System.out.println("向下取整:"+Math.floor(3.9));
        System.out.println("四舍五入："+Math.round(4.5));
        System.out.println("最大值："+Math.max(3, 4));
        System.out.println("最小值:"+Math.min(3, 4));
        System.out.println("绝对值:"+Math.abs(-32));
        //如果不想Math.*,可以把Math中的静态方法导包进来
        //import static java.lang.Math.*;//静态导入
        System.out.println(max(3, 4));
        //如果本地自定义方法和Java中类中方法重名，则优先选择自定义方法
        System.out.println(random(230));
    }
    public static int max(int a,int b) {
        return a>b?a:b;
    }
    public static int random(int a){
        return a;
    }
}
