package com.raon.demos.middle1.lang.exception.example;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws NetworkClientException {
        NetworkService service = new NetworkService();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            service.sendMessage(input);
            System.out.println();
        }

        System.out.println("프로그램을 정상 종료합니다.");
    }
}
