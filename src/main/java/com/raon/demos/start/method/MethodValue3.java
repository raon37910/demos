package com.raon.demos.start.method;

public class MethodValue3 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("changeNumber 호출 전, number:" + number);
        number = changeNumber(number);
        System.out.println("changeNumber 호출 후, number:" + number);
    }

    public static int changeNumber(int number) {
        number *= 2;
        return number;
    }
}
