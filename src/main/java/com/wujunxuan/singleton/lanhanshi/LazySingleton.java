package com.wujunxuan.singleton.lanhanshi;

public class LazySingleton {
    private static LazySingleton lazySingleton=null;
    private static boolean flag=true;

    private LazySingleton(){
        //创建顺序会决定，线程分配会影响创建先后顺序，但是对类加载方式却没有影响。
        //反射防御
        //反射获取对象无法避免
        if (flag){
            flag=false;

        }
        else{
            throw new RuntimeException("单例模式禁止反射");
        }

    }
    //锁的开闭会降低性能
    public synchronized static LazySingleton getInstance(){
        if (lazySingleton==null){
            lazySingleton=new LazySingleton();

        }
        return lazySingleton;
    }
}
