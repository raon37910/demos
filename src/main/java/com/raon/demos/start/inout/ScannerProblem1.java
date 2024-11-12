package com.raon.demos.start.inout;

import java.util.Scanner;

public class ScannerProblem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 이름을 입력하세요:");
        String name = sc.nextLine();
        System.out.print("당신의 나이를 입력하세요:");
        int age = sc.nextInt();

        System.out.printf("당신의 이름은 %s이고, 나이는 %d살입니다.\n", name, age);
    }
}
