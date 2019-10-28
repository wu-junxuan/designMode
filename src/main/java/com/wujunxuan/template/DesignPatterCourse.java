package com.wujunxuan.template;

public class DesignPatterCourse extends ACourse {
    void packageCourse() {
        System.out.println("提供java课程代码" +
                "哈哈哈");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
