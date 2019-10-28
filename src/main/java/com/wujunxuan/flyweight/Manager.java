package com.wujunxuan.flyweight;

public class Manager implements Employee {
    @Override
    public void report() {
        System.out.println(reportContent);

    }
    //外部数据
    private String department;
    //内部数据
    private String tip="tishi";
    private String reportContent;

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public Manager(String department) {
        this.department = department;
    }
}
