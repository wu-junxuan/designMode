package com.wujunxuan.prototype;

import java.text.MessageFormat;

public class MailUtil {
    public static void sendMail(Mail mail){
        String opContent="向同学{0}，邮件地址：{1}，邮件内容：{2}，发送邮件成功";
        System.out.println(MessageFormat.format(opContent, mail.getName(), mail.getMailAddress(), mail.getContent()));
    }
    public static void saveOriginMailRecord(Mail mail){
        System.out.println("存储记录，记录为"+ mail.getContent());
    }

}
