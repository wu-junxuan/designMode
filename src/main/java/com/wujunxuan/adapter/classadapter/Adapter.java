package com.wujunxuan.adapter.classadapter;

public class Adapter extends Adaptee implements Target {
    //使用继承的方式，作为父类
    @Override
    public void request() {
        //..
        super.adapteeRequest();
        //..
    }
}
