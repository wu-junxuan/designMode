package com.wujunxuan.decorator.v1;

public class BatterCakeWithEgg extends BatterCake {
    @Override
    protected String getDesc(){
        return super.getDesc()+"with Egg";

    }
    @Override
    protected int cost(){
        return super.cost()+1;
    }
}
