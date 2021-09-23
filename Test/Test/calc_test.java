package Test.Test;

import Junit.calc;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

public class calc_test {
    //加入@Before注解，每开始执行一次方法，则Before在开始之前会先被执行
    @Before
    public void init(){
        System.out.println("方法预测开始");
    }
    //加入@After注解，每开始执行一次方法，则After会在方法执行结束后再执行
    @After
    public void close(){
        System.out.println("方法预测结束");
    }
    calc c = new calc();
    @org.junit.Test
    public void add_test(){

        int result = c.add(20,30);
        //如果是逻辑有问题，则不好判断
        //所以，利用断言：预测下程序运行结果，判断程序运行的结果与预测的结果是否相等来进行判断
        Assert.assertEquals(50,result);//第一个参数预测结果，第二个为实际结果
        /*
        如果预测结果与返回结果不相等，则会报错
        java.lang.AssertionError:
        Expected :40
        Actual   :50
         */
    }
    @org.junit.Test
    public void sub_test(){
        int sult = c.sub(1,0);

    }
}
