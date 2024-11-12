package com.raon.demos.start.array;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요:");
        int[] arr = new int[5];

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
