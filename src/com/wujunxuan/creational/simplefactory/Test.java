package com.wujunxuan.creational.simplefactory;

public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory=new VideoFactory();
        Video video=videoFactory.getVedio("java");

        video.produce();
    }
}
