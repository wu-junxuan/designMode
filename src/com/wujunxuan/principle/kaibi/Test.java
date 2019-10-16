package com.wujunxuan.principle.kaibi;

public class Test {

    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96, "java", 348d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
        System.out.println(javaCourse.getOriginalPrice());
        System.out.println(javaCourse.toString());
    }

}
