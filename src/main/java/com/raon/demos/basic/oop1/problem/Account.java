package com.raon.demos.basic.oop1.problem;

public class Account {
    int balance;

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        this.balance -= amount;
    }

    public void showBalance() {
        System.out.println("잔액: " + balance);
    }
}
