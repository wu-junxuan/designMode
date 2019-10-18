package com.wujunxuan.builder.v2;

import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Course course=new Course.CourseBuilder().buildCourseName("1").buildCoursePPT("2").buildCourseVideo("3").buildCourseArticle("4").buildCourseQA("5").build();
        System.out.println(course);
        //Set<String> set =ImmutableSet
    }
}
