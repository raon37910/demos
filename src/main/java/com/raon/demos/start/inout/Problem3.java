package com.raon.demos.start.inout;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = sc.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.printf("입력한 이름: %s, 나이: %d\n", name, age);
        }
    }
}