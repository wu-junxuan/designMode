package com.wujunxuan.principle.danyizhize;

public class Method {
    private void updateUserInfo(String userName, String address) {
        userName = "test";
        address = "guangzhou";

    }

    private void updateUserInfo(String userName, String... properties) {
        userName = "test";
        //address="dd";
    }

    private void updateUserName(String userName) {
        userName = "test";

    }

    private void updateUserAddress(String address) {
        address = "guangzhou";
    }

    private void updateUserInfo(String userName, String address, boolean bool) {

        if (bool) {

        } else {

        }
        userName = "test";
        address = "guangzhou";
    }
}
