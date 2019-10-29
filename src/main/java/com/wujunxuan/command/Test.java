package com.wujunxuan.command;

public class Test {
    public static void main(String[] args) {
        CourseVideo courseVideo1=new CourseVideo("java1");
        CourseVideo courseVideo2=new CourseVideo("java2");
        CourseVideo courseVideo3=new CourseVideo("java3");
        CourseVideo courseVideo4=new CourseVideo("java4");
        OpenCourseVideoCommand openCourseVideoCommand=new OpenCourseVideoCommand(courseVideo1);
        CloseCourseVideoCommand closeCourseVideoCommand=new CloseCourseVideoCommand(courseVideo2);

        Staff staff=new Staff();
        staff.addCommand(openCourseVideoCommand);
        staff.addCommand(closeCourseVideoCommand);

        staff.executeCommands();


    }
}
