package com.wujunxuan.chain;

import org.springframework.util.StringUtils;

public class VideoApprover extends Approver {
    @Override
    public void delopy(Course course) {
        if (!StringUtils.isEmpty(course.getVideo())){
            System.out.println(course.getName()+" has video ! accept !");
            if (approver!=null){
                approver.delopy(course);
            }
        }
        else{
            System.out.println(course.getName()+"has not video ! Not accept !");
            return ;
        }

    }
}
