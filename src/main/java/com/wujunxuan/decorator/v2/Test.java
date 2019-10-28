package com.wujunxuan.decorator.v2;

public class Test {
    public static void main(String[] args) {
        ABatterCake aBatterCake;
        aBatterCake=new BatterCake();
        aBatterCake=new EggDecorator(aBatterCake);
        aBatterCake=new EggDecorator(aBatterCake);
        aBatterCake=new SausageDecorator(aBatterCake);
        System.out.println(aBatterCake.getDesc()+aBatterCake.cost());
    }
}
