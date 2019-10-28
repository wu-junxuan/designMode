package com.wujunxuan.iterator;

import java.util.List;

public class CourseIteratorImpl implements CourseIterator {

    private List courseList;
    private int position;
    private Course course;
    public CourseIteratorImpl(List courseList){
        this.courseList=courseList;

    }

    public Course nextCourse() {
        System.out.println("返回的位置是"+position);
        course=(Course)courseList.get(position);
        position++;

        return course;
    }

    public boolean isLastCourse() {
        if (position<courseList.size()){
            return false;
        }
        return true;
    }
}
