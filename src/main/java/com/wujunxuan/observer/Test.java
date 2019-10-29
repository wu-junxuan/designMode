package com.wujunxuan.observer;

public class Test {
    public static void main(String[] args) {
        Course course=new Course("java");
        Teacher teacher=new Teacher("A");

        course.addObserver(teacher);

        Question question=new Question();
        question.setUserName("B");
        question.setQuestionContext("why");
        course.produceQuestion(course,question);

    }
}
