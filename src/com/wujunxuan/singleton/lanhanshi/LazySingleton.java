package com.wujunxuan.singleton.lanhanshi;

public class LazySingleton {
    private static LazySingleton lazySingleton=null;
    private LazySingleton(){

    }
    //锁的开闭会降低性能
    public synchronized static LazySingleton getInstance(){
        if (lazySingleton==null){
            lazySingleton=new LazySingleton();

        }
        return lazySingleton;
    }
}
