package com.wujunxuan.mediator;

public class Test {
    public static void main(String[] args) {
        User user1=new User("user1");
        User user2=new User("user2");
        user1.sendMessage("hey!");
        user2.sendMessage("bye!");
    }
}
