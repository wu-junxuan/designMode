package com.wujunxuan.strategy;

public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }
    public void executeromotion(){
        promotionStrategy.doPromotion();

    }
}
