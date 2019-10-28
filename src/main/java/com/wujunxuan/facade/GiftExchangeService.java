package com.wujunxuan.facade;

public class GiftExchangeService {
    private QualifyService qualifyService;
//    private PointsGift pointsGift;
    private ShoppingService shoppingService;
    private PointPaymentService pointPaymentService;

    public void setQualifyService(QualifyService qualifyService) {
        this.qualifyService = qualifyService;
    }

    public void setPointPaymentService(PointPaymentService pointPaymentService) {
        this.pointPaymentService = pointPaymentService;
    }

    public void setShoppingService(ShoppingService shoppingService) {
        this.shoppingService = shoppingService;
    }
    public void giftchange(PointsGift pointsGift){
        if(qualifyService.isAvailable(pointsGift)){
            if (pointPaymentService.pay(pointsGift)){
                //
                String shippingOrder =shoppingService.shipGift(pointsGift);
                System.out.println("ok"+shippingOrder);
            }
        }
    }

}
