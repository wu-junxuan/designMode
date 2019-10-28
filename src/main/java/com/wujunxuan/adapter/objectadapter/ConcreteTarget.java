package com.wujunxuan.adapter.objectadapter;



public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("ConcreteTarget method");
    }
}
