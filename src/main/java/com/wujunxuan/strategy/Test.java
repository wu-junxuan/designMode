package com.wujunxuan.strategy;


public class Test {
    public static void main(String[] args) {
        //并不能完全消除id-else
        PromotionActivity a11=new PromotionActivity(new LiJianPromotionStrategy());
        PromotionActivity b18=new PromotionActivity(new FanXianPromotionStrategy());
        a11.executeromotion();
        b18.executeromotion();

    }
//public static void main(String[] args) {
//    PromotionActivity promotionActivity=null;
//    String promotionKey="LIJIAN";
//    if (StringUtils.equals(promotionKey,"LIJIAN")){
//        promotionActivity=new PromotionActivity(new LiJianPromotionStrategy());
//    }
//    else if(StringUtils.equals(promotionKey,"FANXIAN")){
//        promotionActivity=new PromotionActivity(new FanXianPromotionStrategy());
//    }else if (StringUtils.equals(promotionKey,"MANJIAN")){
//        promotionActivity=new PromotionActivity(new ManJianPromotionStrategy());
//    }
//    else {
////        ...
//    }
//    promotionActivity.executeromotion();
//
//}
//public static void main(String[] args) {
//    String promotionKey="LIJIAN";
//    PromotionActivity promotionActivity=new PromotionActivity(PromotionStrategyFactory.getPPromotionStrategyFactory(promotionKey));
//    promotionActivity.executeromotion();
//}
}
