package com.raon.demos.start.method;

public class MethodEx2 {
    public static void main(String[] args) {
        String message = "Hello, World";
        printN(3, message);
        printN(5, message);
        printN(7, message);
    }

    public static void printN(int n, String message) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
}
