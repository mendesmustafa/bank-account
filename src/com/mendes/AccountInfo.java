package com.mendes;

/**
 * Created by mendesmustafa on 28.10.2020.
 */

public class AccountInfo {

    private int accountNo;
    private double accountMoney;
    private static double allAccountMoney;
    private static int allAccountCount;
    private static int operationCount;

    public AccountInfo(int accountNo, double accountMoney) {
        this.accountNo = accountNo;
        this.accountMoney = accountMoney;
        allAccountMoney = allAccountCount + accountMoney;
        allAccountCount++;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public double getAccountMoney() {
        return accountMoney;
    }

    public void setAccountMoney(double accountMoney) {
        this.accountMoney = accountMoney;
    }

    public void deposit(double amount) {
        this.accountMoney = accountMoney + amount;
        operationCount++;
        allAccountMoney = allAccountMoney + amount;
    }

    public void withdraw(double amount) {
        if (this.accountMoney >= amount) {
            this.accountMoney = accountMoney - amount;
            operationCount++;
            allAccountMoney = allAccountMoney - amount;
        } else {
            System.out.println("Hesabınızda yeterli para yok !");
        }
    }

    public void comparison(AccountInfo accountInfo) {
        if (this.getAccountMoney() < accountInfo.getAccountMoney()) {
            System.out.println(this.getAccountNo() + " nolu kişinin parası " + accountInfo.getAccountNo() + " nolu kişinin parasından azdır.");
        } else if (this.getAccountMoney() > accountInfo.getAccountMoney()) {
            System.out.println(this.getAccountNo() + " nolu kişinin parası " + accountInfo.getAccountNo() + " nolu kişinin parasından fazladır.");
        } else {
            System.out.println(this.getAccountNo() + " nolu kişinin parası " + accountInfo.getAccountNo() + " nolu kişinin parasından eşittir.");
        }
    }

    public static void showBankSummary() {
        System.out.println("Bankadaki hesap sayısı: " + allAccountCount);
        System.out.println("Bankadaki toplam para: " + allAccountMoney);
        System.out.println("Bankadaki toplam işlem sayısı: " + operationCount);
    }
}