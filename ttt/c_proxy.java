package ttt;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class c_proxy implements InvocationHandler {
    private i_c i_c1;
    public c_proxy(i_c i_c1){
        this.i_c1=i_c1;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();//前置增强
        Object ret = method.invoke(i_c1);
        after();//后置增强
        return ret;
    }
    private void before(){
        System.out.println("XXXXXXXXXXXXXXXX");
    }
    private void after(){
        System.out.println("XXXXXXXXXXXXXXXX");
    }
    public Object getProxyInstance(){
        //newProxyInstance()静态方法
        return Proxy.newProxyInstance(i_c1.getClass().getClassLoader(),i_c1.getClass().getInterfaces(),this);
        //类加载器
        //接口
        //this-->invocationhandler
    }
}
