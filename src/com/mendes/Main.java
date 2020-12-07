package com.mendes;

public class Main {

    public static void main(String[] args) {

        AccountInfo accountInfo = new AccountInfo(111, 300.90);
        AccountInfo accountInfo1 = new AccountInfo(222, 599.99);
        AccountInfo accountInfo2 = new AccountInfo(333, 1000);

        accountInfo.deposit(500);
        accountInfo1.withdraw(1500);
        accountInfo2.withdraw(150);
        AccountInfo.showBankSummary();
        System.out.println("\n");
        accountInfo.comparison(accountInfo1);
        accountInfo1.comparison(accountInfo2);
        accountInfo2.comparison(accountInfo);
    }
}