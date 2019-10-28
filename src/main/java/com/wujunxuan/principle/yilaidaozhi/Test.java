package com.wujunxuan.principle.yilaidaozhi;

public class Test {
    public static void main(String[] args) {
//        Geely geely =new Geely();
//        geely.studyFECourse();
//        geely.studyJavaCourse();
        //假如需要学习python，就需要修改Geely类
        //高层次模块不应该依赖低层次模块，不然低层次模块需要经常修改

//        Geely geely =new Geely();
//        geely.studyCourse(new JavaCourse());
//        geely.studyCourse(new FECourse());
//        geely.studyCourse(new PythonCourse());

//        Geely geely =new Geely(new JavaCourse());
//        geely.studyCourse();

        Geely geely = new Geely();
        geely.setiCourse(new JavaCourse());
        geely.studyCourse();
        geely.setiCourse(new FECourse());
        geely.studyCourse();
        //隔离，geely不需要修改，只需要修改课程。也就是说在底层模块扩展
        //以抽象为基础，采用setter/constructor
        //核心思想面向接口编程


    }


}
