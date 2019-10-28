package com.wujunxuan.proxy;

public class OrderServiceImpl implements IOrderService {

    private IOrderDao iOrderDao;

    public void setiOrderDao(IOrderDao iOrderDao) {
        this.iOrderDao = iOrderDao;
    }

    @Override
    public int saveOrder(Order order) {
        //spring自行设置
        iOrderDao=new OrderDaoImpl();
        System.out.println("service 调用DAO添加order");
        return iOrderDao.insert(order);
    }
}
