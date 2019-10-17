package com.wujunxuan.builder;

public class CourseActualBuilder extends CourseBuilder {

    private Course course=new Course();
    @Override
    public void buildCourseName(String courseName) {
course.setCourseName(courseName);
    }

    @Override
    public void buildcoursePPT(String dcoursePPT) {
        course.setCoursePPT(dcoursePPT);
    }

    @Override
    public void buildcourseVideo(String courseVide) {
        course.setCourseVideo(courseVide);
    }

    @Override
    public void buildcourseArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);
    }

    @Override
    public void buildcourseQA(String courseQA) {
        course.setCourseQA(courseQA);
    }

    @Override
    public Course makeCourse() {
        return this.course;
    }
}
