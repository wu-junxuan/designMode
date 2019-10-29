package com.wujunxuan.chain;

public class Test {
    public static void main(String[] args) {
        Approver articleApprover=new ArticleApprover();
        Approver videoApprover=new VideoApprover();

        Course course=new Course();
        course.setName("java");
        course.setArticle("note");
        course.setVideo("video");

        articleApprover.setNextApprover(videoApprover);
        articleApprover.delopy(course);
    }
}
