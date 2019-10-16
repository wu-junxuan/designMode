package com.wujunxuan.creational.simplefactory;

import java.sql.SQLOutput;

public class JavaVideo extends Video {
    @Override
    public void produce(){
        System.out.println("java video is collecting");
    }

}
