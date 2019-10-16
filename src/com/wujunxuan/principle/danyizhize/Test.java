package com.wujunxuan.principle.danyizhize;

public class Test {
    public static void main(String[] args) {
//        Bird bird=new Bird();
//        bird.mainMovemode("bird");
//        bird.mainMovemode("birds");
        FlyBird flyBird = new FlyBird();
        WalkBird walkBird = new WalkBird();
        flyBird.mainMovemode("bird");
        walkBird.mainMovemode("duck");
    }
}
