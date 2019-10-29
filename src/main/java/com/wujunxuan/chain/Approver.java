package com.wujunxuan.chain;

public abstract class Approver {
    protected Approver approver;//handler

    public void setNextApprover(Approver approver){
        this.approver=approver;

    }
    public abstract void delopy(Course course);

}
