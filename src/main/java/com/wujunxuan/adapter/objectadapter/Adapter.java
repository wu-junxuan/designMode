package com.wujunxuan.adapter.objectadapter;

public class Adapter implements Target {
    //使用组合方式，作为参数
    private Adaptee adaptee=new Adaptee();
    @Override
    public void request() {
        adaptee.adapteeRequest();

    }
}
