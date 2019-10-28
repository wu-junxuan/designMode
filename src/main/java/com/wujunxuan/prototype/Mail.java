package com.wujunxuan.prototype;

public class Mail implements Cloneable{

    private String name;
    private String mailAddress;
    private String content;

    public Mail() {
        System.out.println("mail constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
    }
}
