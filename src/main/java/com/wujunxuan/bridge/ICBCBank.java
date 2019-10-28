package com.wujunxuan.bridge;

public class ICBCBank extends Bank{
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("中国工商银行账号");
        //委托给account实现
        account.openAccount();
        return account;
    }
}
