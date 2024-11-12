package com.raon.demos.start.array;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 수를 입력하세요:");
        int n = sc.nextInt();
        int[][] students = new int[n][3];

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            System.out.print("국어 점수:");
            students[i][0] = sc.nextInt();
            System.out.print("영어 점수:");
            students[i][1] = sc.nextInt();
            System.out.print("수학 점수:");
            students[i][2] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            double avg = 0;

            for (int j = 0; j < 3; j++) {
                sum += students[i][j];
            }

            avg = (double) sum / 3;
            System.out.println((i+1) + "번 학생의 총점: " + sum + ", 평균: " + avg);
        }
    }
}
