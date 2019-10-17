package com.wujunxuan.creational.factory;

public class JavaVideoFcatory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
