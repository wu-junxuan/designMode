package com.wujunxuan.decorator.v1;

public class BatterCakeWithEggSausage extends BatterCakeWithEgg {
    @Override
    protected String getDesc(){
        return super.getDesc()+"with Sausage";

    }
    @Override
    protected int cost(){
        return super.cost()+2;
    }

}
