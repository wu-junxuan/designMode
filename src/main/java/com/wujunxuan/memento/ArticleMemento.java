package com.wujunxuan.memento;

public class ArticleMemento {
    //与原来的保持一致
    private String title;
    private String content;
    private String imgs;

    public ArticleMemento() {
    }

    public ArticleMemento(String title, String content, String imgs) {
        this.title = title;
        this.content = content;
        this.imgs = imgs;
    }

    //不需要set，只允许构造器修改
    public String getTitle() {
        return title;
    }

//    public void setTitle(String title) {
//        this.title = title;
//    }

    public String getContent() {
        return content;
    }

//    public void setContent(String content) {
//        this.content = content;
//    }

    public String getImgs() {
        return imgs;
    }

//    public void setImgs(String imgs) {
//        this.imgs = imgs;
//    }

    @Override
    public String toString() {
        return "ArticleMemento{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", imgs='" + imgs + '\'' +
                '}';
    }
}
