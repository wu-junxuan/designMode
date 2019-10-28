package com.wujunxuan.proxy.dongtai;




import com.wujunxuan.proxy.Order;
import com.wujunxuan.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }
    public Object bind(){
        Class cls=target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),this);

    }

    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Object argObject=objects[0];
        before(argObject);
        Object object = method.invoke(target,objects);
        afterMethod();
        return object;
    }

    private void before(Object obj){
        int userId=0;
        System.out.println("动态代理 before method");
        if (obj instanceof Order){
            Order order =(Order)obj;userId=order.getUserId();
        }
        int dbRouter=userId%2;
        System.out.println("动态代理分配到DB"+dbRouter+"处理数据");
        //shezhi
        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));

        System.out.println("动态代理 before method");

    }
    private void afterMethod(){
        System.out.println("动态代理 after method");

    }
}
