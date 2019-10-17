package com.wujunxuan.builder;

public abstract class CourseBuilder {
//    private String courseNanme;
//    private String coursePPT;
//    private String courseVideo;
//    private String courseArticle;
//
//    private String courseQA;
    public abstract  void buildCourseName(String courseName);
    public abstract  void buildcoursePPT(String dcoursePPT);
    public abstract  void buildcourseVideo(String courseVide);
    public abstract  void buildcourseArticle(String courseArticle);
    public abstract  void buildcourseQA(String courseQA);

    public abstract Course makeCourse();

}
