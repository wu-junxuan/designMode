package com.wujunxuan.bridge;

public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中农行账号");
        //委托给account实现
        account.openAccount();
        return account;
    }
}
