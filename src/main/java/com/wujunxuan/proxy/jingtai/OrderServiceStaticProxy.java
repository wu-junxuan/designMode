package com.wujunxuan.proxy.jingtai;

import com.wujunxuan.proxy.IOrderService;
import com.wujunxuan.proxy.Order;
import com.wujunxuan.proxy.OrderServiceImpl;
import com.wujunxuan.proxy.db.DataSourceContextHolder;

public class OrderServiceStaticProxy {
    private IOrderService iOrderService;

    public int saveOrder(Order order){
        beforeMethod(order);
        iOrderService=new OrderServiceImpl();
        int result=iOrderService.saveOrder(order);
        afterMethod();
        return result;
    }
    private void beforeMethod(Order order){

        int userId=order.getUserId();
        int dbRouter=userId%2;
        System.out.println("静态代理分配到DB"+dbRouter+"处理数据");
        //shezhi
        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));

        System.out.println("static before method");

    }
    private void afterMethod(){
        System.out.println("static after method");

    }
}
