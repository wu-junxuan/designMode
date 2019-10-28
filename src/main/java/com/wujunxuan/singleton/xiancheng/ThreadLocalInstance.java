package com.wujunxuan.singleton.xiancheng;

public class ThreadLocalInstance {
    //为多线程提供单例模，关键在于可以将各线程创建的对象最终返回唯一一个对象
    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstanceThreadLocal
            =new ThreadLocal<ThreadLocalInstance>(){
        @Override
        protected ThreadLocalInstance initialValue(){
            return new ThreadLocalInstance();
        }

    };
    private ThreadLocalInstance(){

    }
    public static ThreadLocalInstance getInstance(){
        return threadLocalInstanceThreadLocal.get();
    }
    //spring实现的单例是在整个应用上下文中使用，而不是这里的单独某个模块。
    //通过代理获得之前创建的对象。

    //mybatis错误顺序按顺序保存并且线程唯一
}
