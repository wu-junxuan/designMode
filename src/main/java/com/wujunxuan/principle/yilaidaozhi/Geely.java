package com.wujunxuan.principle.yilaidaozhi;

public class Geely {

    private ICourse iCourse;

    public Geely() {

    }


    public Geely(ICourse iCourse) {
        this.iCourse = iCourse;

    }

    public ICourse getiCourse() {
        return iCourse;
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse() {
        iCourse.studyCourse();
    }
}
