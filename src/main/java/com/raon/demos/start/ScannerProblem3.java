package com.raon.demos.start;

import java.util.Scanner;

public class ScannerProblem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("음식의 이름을 입력하세요:");
        String foodName = sc.nextLine();
        System.out.print("음식의 가격을 입력하세요:");
        int foodPrice = sc.nextInt();
        System.out.print("음식의 수량을 입력하세요:");
        int foodQuantity = sc.nextInt();

        int totalPrice = foodPrice * foodQuantity;
        System.out.printf("[%s] [%d]개를 주문하셨습니다. 총 가격은 [%d]원 입니다.\n", foodName, foodQuantity, totalPrice);
    }
}
