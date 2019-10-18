package com.wujunxuan.singleton.jingtaineibulei;

public class StaticInnerClassSingleton {
    //哪个线程拿到就那个创建
    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton=new StaticInnerClassSingleton();
    }
    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }
    private  StaticInnerClassSingleton(){

    }
}
