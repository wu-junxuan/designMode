package com.wujunxuan.strategy;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {
    private static Map<String,PromotionStrategy> PROMOTION_STRATEGY=new HashMap<String,PromotionStrategy>();
    static {
        PROMOTION_STRATEGY.put(PromotionKey.FANXIAN,new FanXianPromotionStrategy());
        PROMOTION_STRATEGY.put(PromotionKey.MANJIAN,new ManJianPromotionStrategy());
        PROMOTION_STRATEGY.put(PromotionKey.LIJIAN,new LiJianPromotionStrategy());
    }
    private static final PromotionStrategy NON_PROMOTION=new EmptyPromotionStrategy();
    private PromotionStrategyFactory(){

    }
    public static PromotionStrategy getPPromotionStrategyFactory(String key){
        PromotionStrategy promotionStrategy= PROMOTION_STRATEGY.get(key);
        return promotionStrategy == null ? NON_PROMOTION : promotionStrategy;

    }
    private interface PromotionKey{
        String LIJIAN="LIJIAN";
        String MANJIAN="MANJIAN";
        String FANXIAN="FANXIAN";
    }

}
