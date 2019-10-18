package com.wujunxuan.singleton.lanhanshi;

public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton=null;
    private LazyDoubleCheckSingleton(){

    }
    //锁的开闭会降低性能
    public static LazyDoubleCheckSingleton getInstance(){
        if (lazyDoubleCheckSingleton==null){
            synchronized (LazySingleton.class) {
            if (lazyDoubleCheckSingleton==null){
                lazyDoubleCheckSingleton=new LazyDoubleCheckSingleton();
            }
            }

        }
        return lazyDoubleCheckSingleton;
    }
}
