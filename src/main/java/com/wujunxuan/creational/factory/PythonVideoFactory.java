package com.wujunxuan.creational.factory;

public class PythonVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
