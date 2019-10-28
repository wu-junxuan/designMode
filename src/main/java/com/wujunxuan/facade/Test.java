package com.wujunxuan.facade;

public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift=new PointsGift("test");
        GiftExchangeService giftExchangeService=new GiftExchangeService();
        giftExchangeService.setPointPaymentService(new PointPaymentService());
        giftExchangeService.setQualifyService(new QualifyService());
        giftExchangeService.setShoppingService(new ShoppingService());

        giftExchangeService.giftchange(pointsGift);
    }
}
