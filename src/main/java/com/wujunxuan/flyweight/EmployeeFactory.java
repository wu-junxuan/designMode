package com.wujunxuan.flyweight;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {
    public static final Map<String,Employee> EMPLOYEE_MAP=new HashMap<String ,Employee>();
    public static Employee getManager(String department){
        Manager manager= (Manager)EMPLOYEE_MAP.get(department);
        if (manager == null) {
            manager =new Manager(department);
            System.out.println("创建经理成功"+department);
            String reportContent=department+"汇报内容是。。。";
            manager.setReportContent(reportContent);
            System.out.println("创建报告："+reportContent);
            EMPLOYEE_MAP.put(department,manager);
            System.out.println("create successful"+department);

        }
        return manager;
    }
}
