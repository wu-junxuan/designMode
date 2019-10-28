package com.wujunxuan.singleton.ehanshi;

import java.io.Serializable;

public class HunrySingleton implements Serializable {
    private final static HunrySingleton HUNRY_SINGLETON;

    static {
        HUNRY_SINGLETON=new HunrySingleton();
    }

    private HunrySingleton(){
        //反射防御
        if(HUNRY_SINGLETON!=null){
            throw new RuntimeException("单例模式禁止反射");
        }

    }
    public static HunrySingleton getInstance(){
        return HUNRY_SINGLETON;
    }
    private Object readResolve(){
        return HUNRY_SINGLETON;
    }

    //readResolve()作用：来自objectInputStream-readOrdinaryObject,通过反射查找是否存在此方法并且序列化，有就返回true
}
