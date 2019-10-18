package com.wujunxuan.singleton.ehanshi;

import java.io.Serializable;

public class HunrySingleton implements Serializable {
    private final static HunrySingleton HUNRY_SINGLETON;

    static {
        HUNRY_SINGLETON=new HunrySingleton();
    }

    private HunrySingleton(){

    }
    public static HunrySingleton getInstance(){
        return HUNRY_SINGLETON;
    }
    private Object readResolve(){
        return HUNRY_SINGLETON;
    }
}
