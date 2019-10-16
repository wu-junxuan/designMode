package com.wujunxuan.principle.danyizhize;

public class Bird {

    public void mainMovemode(String birdName) {
        if (!"bird".equalsIgnoreCase(birdName)) {
            System.out.println(birdName + " can't  fly");

        } else {
            System.out.println(birdName + " is flying");

        }
    }
}
