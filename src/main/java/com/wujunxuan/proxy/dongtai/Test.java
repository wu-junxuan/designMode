package com.wujunxuan.proxy.dongtai;

import com.wujunxuan.proxy.IOrderService;
import com.wujunxuan.proxy.Order;
import com.wujunxuan.proxy.OrderServiceImpl;


public class Test {
    public static void main(String[] args) {
        Order order=new Order();
        order.setUserId(2);

        IOrderService orderServiceDynamicProxy=(IOrderService)new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderServiceDynamicProxy.saveOrder(order);
    }
}
