package com.wujunxuan.decorator.v2;

public class AbstractDecorator extends ABatterCake {
    private ABatterCake aBatterCake;

    //既然能放抽象的，肯定能放抽象的实现类
    public AbstractDecorator(ABatterCake aBatterCake) {
        this.aBatterCake = aBatterCake;
    }
    //这个位置可以用在子类实现特定的方法等等
    //protected  abstract void dosomething();

    @Override
    protected String getDesc() {
        return aBatterCake.getDesc();
    }

    @Override
    protected int cost() {
        return aBatterCake.cost();
    }
}
