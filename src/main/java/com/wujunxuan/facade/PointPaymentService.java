package com.wujunxuan.facade;

public class PointPaymentService {
    public boolean pay(PointsGift pointsGift){
        //--
        System.out.println("支付"+ pointsGift.getName()+"成功");
        return true;

    }
}
