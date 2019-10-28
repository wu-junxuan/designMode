package com.wujunxuan.bridge;

public class DepositAccount implements Account{
    @Override
    public Account openAccount() {
        System.out.println("这是定期账号");
        return null;
    }

    @Override
    public void showAccountType() {

    }
}
