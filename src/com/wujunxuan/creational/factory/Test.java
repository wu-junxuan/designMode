package com.wujunxuan.creational.factory;

public class Test {
    public static void main(String[] args) {
    VideoFactory videoFactory=new JavaVideoFcatory();
        Video video= videoFactory.getVideo();
        video.produce();


    }
}
