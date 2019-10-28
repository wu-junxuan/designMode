package com.wujunxuan.decorator.v2;

public class EggDecorator extends AbstractDecorator {
    public EggDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+"with Egg";
    }

    @Override
    protected int cost() {
        return super.cost()+1;
    }
}
