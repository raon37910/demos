package com.raon.demos.basic.oop1.problem;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);
        account.showBalance();
    }
}
