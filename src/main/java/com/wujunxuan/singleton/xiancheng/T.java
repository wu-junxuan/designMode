package com.wujunxuan.singleton.xiancheng;

import com.wujunxuan.singleton.jingtaineibulei.StaticInnerClassSingleton;

public class T implements Runnable {
    @Override
    public void run() {
        ThreadLocalInstance instance=ThreadLocalInstance.getInstance();

        System.out.println("T end");
    }
}
