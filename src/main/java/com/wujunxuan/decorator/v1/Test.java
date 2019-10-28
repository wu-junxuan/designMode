package com.wujunxuan.decorator.v1;

public class Test {
    public static void main(String[] args) {
        BatterCake batterCake=new BatterCake();
        System.out.println(batterCake.getDesc()+"\n"+ batterCake.cost());

        BatterCakeWithEgg batterCakeWithEgg=new BatterCakeWithEgg();
        System.out.println(batterCakeWithEgg.getDesc()+"\n"+batterCakeWithEgg.cost());

        BatterCakeWithEggSausage batterCakeWithEggSausage=new BatterCakeWithEggSausage();
        System.out.println(batterCakeWithEggSausage.getDesc()+"\n"+ batterCakeWithEggSausage.cost());


    }
}
