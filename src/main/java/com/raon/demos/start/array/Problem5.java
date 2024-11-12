package com.raon.demos.start.array;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 받을 숫자의 개수를 입력하세요:");
        int n = sc.nextInt();
        System.out.printf("%d개의 정수를 입력하세요:", n);
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        double avg = 0.0;
        for(int num: arr) {
            sum += num;
        }

        avg = (double) sum / arr.length;

        System.out.println("입력한 정수의 합계:" + sum);
        System.out.println("입력한 정수의 평균:" + avg);
    }
}
