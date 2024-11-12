package com.raon.demos.start.method;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;
        int depositAmount = 1000;
        balance = deposit(depositAmount, balance);
        int withdrawAmount = 2000;
        balance = withdraw(withdrawAmount, balance);
        System.out.println("최종 잔액:" + balance + "원");
    }

    public static int deposit(int depositAmount, int balance) {
        int newBalance = balance + depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + newBalance);
        return newBalance;
    }

    public static int withdraw(int withdrawAmount, int balance) {
        if (balance >= withdrawAmount) {
            int newBalance = balance - withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + newBalance);
            return newBalance;
        }

        System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
        return balance;
    }
}
