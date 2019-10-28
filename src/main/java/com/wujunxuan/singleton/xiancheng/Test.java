package com.wujunxuan.singleton.xiancheng;



public class Test {
    public static void main(String[] args)  throws Exception {
        Thread t1=new Thread(new T());
        Thread t2=new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("end main");


    }
}
