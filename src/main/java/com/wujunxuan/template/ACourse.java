package com.wujunxuan.template;

public abstract class ACourse {
    protected final void makeCourse(){
        this.makePPT();
        this.makeVideo();
        if (needWriteArticle()){
            this.writeArticle();
        }
        this.packageCourse();

    }
    final void makePPT(){
        System.out.println("制作ppt");
    }
    final void makeVideo(){
        System.out.println("制作视频");
    }
    final void writeArticle(){
        System.out.println("编写笔记");
    }
    //钩子
    protected boolean needWriteArticle(){
        return false;
    }
    abstract void packageCourse();

}
