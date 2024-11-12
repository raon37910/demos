package com.raon.demos.start.array;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 받을 숫자의 개수를 입력하세요:");
        int n = sc.nextInt();
        System.out.printf("%d개의 정수를 입력하세요:\n", n);
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for(int num: arr) {
            if (min > num) {
                min = num;
            }

            if (max < num) {
                max = num;
            }
        }

        System.out.println("가장 큰 정수:" + max);
        System.out.println("가장 작은 정수:" + min);
    }
}
