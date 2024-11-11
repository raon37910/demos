package com.raon.demos.start;

import java.util.Scanner;

public class ScannerProblem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("구구단의 단 수를 입력해주세요: ");
        int n = sc.nextInt();
        System.out.printf("%d단의 구구단:\n", n);

        for (int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
    }
}
