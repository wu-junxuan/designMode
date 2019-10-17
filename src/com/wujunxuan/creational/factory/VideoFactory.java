package com.wujunxuan.creational.factory;

public abstract class VideoFactory {
    //改用interface也可以，首选抽象类，因为会有一些固定相同的方法

//    public Video getVedio(String type){
//        if ("java".equalsIgnoreCase(type)){
//            return new JavaVideo();
//        }else if ("python".equalsIgnoreCase(type)){
//            return new PythonVideo();
//        }
//        else
//            return null;
//    }

    public abstract Video getVideo();
}
