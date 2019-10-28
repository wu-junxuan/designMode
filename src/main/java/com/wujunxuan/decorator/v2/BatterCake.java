package com.wujunxuan.decorator.v2;

public class BatterCake extends ABatterCake{
    @Override
    protected String getDesc() {
        return "BatterCake";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
