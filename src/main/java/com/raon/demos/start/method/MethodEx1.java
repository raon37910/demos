package com.raon.demos.start.method;

public class MethodEx1 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        System.out.println("평균값: " + avg(a, b, c));

        int x = 15, y = 25, z = 35;
        System.out.println("평균값: " + avg(x, y, z));
    }

    public static double avg(int a, int b, int c) {
        return (double) (a + b + c) / 3;
    }
}
