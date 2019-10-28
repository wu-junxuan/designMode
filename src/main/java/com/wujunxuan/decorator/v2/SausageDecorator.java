package com.wujunxuan.decorator.v2;

public class SausageDecorator extends AbstractDecorator{
    public SausageDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+"with sausage";
    }

    @Override
    protected int cost() {
        return super.cost()+2;
    }
}
