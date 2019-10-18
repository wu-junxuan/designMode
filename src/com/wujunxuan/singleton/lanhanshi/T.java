package com.wujunxuan.singleton.lanhanshi;

import com.wujunxuan.singleton.jingtaineibulei.StaticInnerClassSingleton;

public class T implements Runnable {
    @Override
    public void run() {
        //LazySingleton lazySingleton=LazySingleton.getInstance();
        //LazyDoubleCheckSingleton lazyDoubleCheckSingleton=LazyDoubleCheckSingleton.getInstance();
        StaticInnerClassSingleton staticInnerClassSingleton=StaticInnerClassSingleton.getInstance();
        System.out.println("T end");
    }
}
