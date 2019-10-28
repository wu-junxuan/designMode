package com.wujunxuan.strategy;

public class EmptyPromotionStrategy implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("没有促销");
    }
}
