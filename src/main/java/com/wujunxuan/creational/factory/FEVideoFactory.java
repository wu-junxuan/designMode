package com.wujunxuan.creational.factory;

public class FEVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
