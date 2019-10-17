package com.wujunxuan.builder;

public class Coach {
    private  CourseBuilder courseBuilder;
    public Course makeCourse(String courseName, String coursePPT, String courseVideo, String courseArticle, String courseQA){
        this.courseBuilder.buildCourseName(courseName);
        this.courseBuilder.buildcoursePPT(coursePPT);
        this.courseBuilder.buildcourseVideo(courseVideo);
        this.courseBuilder.buildcourseArticle(courseArticle);
        this.courseBuilder.buildcourseQA(courseQA);
        return this.courseBuilder.makeCourse();

    }

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }
}
