package com.wujunxuan.chain;

import org.springframework.util.StringUtils;

public class ArticleApprover extends Approver {
    @Override
    public void delopy(Course course) {
    if (!StringUtils.isEmpty(course.getArticle())){
        System.out.println(course.getName()+" has note ! accept !");
        if (approver!=null){
            approver.delopy(course);
        }
    }
    else{
        System.out.println(course.getName()+"has not note ! Not accept !");
        return ;
    }
    }
}
