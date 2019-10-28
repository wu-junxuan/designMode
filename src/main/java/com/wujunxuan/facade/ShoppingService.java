package com.wujunxuan.facade;

public class ShoppingService {
    public String shipGift(PointsGift pointsGift){
        //物流
        System.out.println(pointsGift.getName()+"以派送");
        String shippingOrderNo="666";
        return shippingOrderNo;

    }
}
