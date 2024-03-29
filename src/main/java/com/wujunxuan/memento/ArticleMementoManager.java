package com.wujunxuan.memento;

import java.util.Stack;

public class ArticleMementoManager {
    private final Stack<ArticleMemento> ARTICLE_MEMENTO_STACK=new Stack<ArticleMemento>();

    //确保获取最新的
    public ArticleMemento get(){
        ArticleMemento articleMemento=ARTICLE_MEMENTO_STACK.pop();
        return articleMemento;
    }

    public void addMemento(ArticleMemento articleMemento){
        ARTICLE_MEMENTO_STACK.push(articleMemento);
    }
}
