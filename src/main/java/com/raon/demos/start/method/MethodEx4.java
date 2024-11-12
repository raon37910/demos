package com.raon.demos.start.method;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        int balance = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            int menu = selectMenu(sc);
            if (menu == 1) {
                balance = deposit(sc, balance);
            } else if (menu == 2) {
                balance = withdraw(sc, balance);
            } else if (menu == 3) {
                getBalance(balance);
            } else {
                System.out.println("시스템을 종료합니다.");
                break;
            }
        }
    }

    public static int selectMenu(Scanner sc) {
        System.out.println("-------------------------------------");
        System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
        System.out.println("-------------------------------------");
        System.out.print("선택:");
        return sc.nextInt();
    }

    public static int deposit(Scanner sc , int balance) {
        System.out.print("입금액을 입력하세요:");
        int depositAmount = sc.nextInt();
        int newBalance = balance + depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + newBalance);
        return newBalance;
    }

    public static int withdraw(Scanner sc, int balance) {
        System.out.print("출금액을 입력하세요:");
        int withdrawAmount = sc.nextInt();
        if (balance >= withdrawAmount) {
            int newBalance = balance - withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + newBalance);
            return newBalance;
        }

        System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
        return balance;
    }

    public static void getBalance(int balance) {
        System.out.println("현재 잔액: " + balance);
    }
}
