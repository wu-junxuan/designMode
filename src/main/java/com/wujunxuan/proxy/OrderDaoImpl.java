package com.wujunxuan.proxy;

public class OrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("DAO 添加order成功");
        return 1;
    }
}
