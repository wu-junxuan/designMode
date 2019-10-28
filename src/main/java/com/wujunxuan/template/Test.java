package com.wujunxuan.template;

public class Test {
    public static void main(String[] args) {
        System.out.println("java start------------");
        ACourse designPatternCOurse=new DesignPatterCourse();
        designPatternCOurse.makeCourse();
        System.out.println("java end------------");

        System.out.println("前端 start------------");
        ACourse feCourse=new FECourse();
        feCourse.makeCourse();
        System.out.println("前端 end------------");

    }
}
