package com.wujunxuan.prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail=new Mail();
        mail.setContent("test");
        for (int i=0;i<10;i++){
            Mail temp=(Mail)mail.clone();//没有调用构造器

            temp.setName("name"+i);
            temp.setMailAddress("name"+i+"@test.com");
            temp.setContent("233333");
            MailUtil.sendMail(temp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
