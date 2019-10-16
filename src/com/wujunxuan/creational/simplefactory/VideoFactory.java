package com.wujunxuan.creational.simplefactory;

public class VideoFactory {
    public Video getVedio(String type){
        if ("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if ("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }
        else
            return null;
    }
}
