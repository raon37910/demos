package com.raon.demos.start;

import org.junit.jupiter.api.Test;

public class ArrayTest {

    @Test
    void ex1() {
        int student1 = 90;
        int student2 = 80;
        int student3 = 70;
        int student4 = 60;
        int student5 = 50;

        System.out.println("학생1 점수:" + student1);
        System.out.println("학생2 점수:" + student2);
        System.out.println("학생3 점수:" + student3);
        System.out.println("학생4 점수:" + student4);
        System.out.println("학생5 점수:" + student5);
    }

    @Test
    void ex2() {
        int[] students;
        students = new int[5];

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        System.out.println("학생1 점수:" + students[0]);
        System.out.println("학생2 점수:" + students[1]);
        System.out.println("학생3 점수:" + students[2]);
        System.out.println("학생4 점수:" + students[3]);
        System.out.println("학생5 점수:" + students[4]);
    }

    @Test
    void ex3() {
        int[] students;
        students = new int[5];

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수:" + students[i]);
        }
    }

    @Test
    void ex4() {
        int[] students;
        students = new int[]{90, 80, 70, 60, 50};

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수:" + students[i]);
        }
    }

    @Test
    void ex5() {
        int[] students = {90, 80, 70, 60, 50};

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수:" + students[i]);
        }
    }

    @Test
    void ex6 () {
        int[][] arr = new int[2][3];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        System.out.print(arr[0][0] + " ");
        System.out.print(arr[0][1] + " ");
        System.out.print(arr[0][2] + " ");
        System.out.println();

        System.out.print(arr[1][0] + " ");
        System.out.print(arr[1][1] + " ");
        System.out.print(arr[1][2] + " ");
        System.out.println();
    }

    @Test
    void ex7() {
        int[][] arr = new int[2][3];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        for(int row = 0; row < 2; row++) {
            System.out.print(arr[row][0] + " ");
            System.out.print(arr[row][1] + " ");
            System.out.print(arr[row][2] + " ");
            System.out.println();
        }
    }

    @Test
    void ex8() {
        int[][] arr = new int[2][3];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        for(int row = 0; row < 2; row++) {
            for(int col = 0; col < 3; col ++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    @Test
    void ex9() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };

        for(int row = 0; row < 2; row++) {
            for(int col = 0; col < 3; col ++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    @Test
    void ex10() {
        int[][] arr = new int[4][5];

        int i = 1;
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                arr[row][col] = i++;
            }
        }

        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col ++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    @Test
    void ex11() {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        for(int number: numbers) {
            System.out.println(number);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number" + i + "번의 결과는: " + numbers[i]);
        }
    }

    @Test
    void problem1() {
        int[] students = {90, 80, 70, 60, 50};
        int sum = 0;
        double avg = 0.0;

        for(int student: students) {
            sum += student;
        }

        avg = (double) sum / students.length;
        System.out.println("점수 총합:" + sum);
        System.out.println("점수 평균:" + avg);
    }
}
