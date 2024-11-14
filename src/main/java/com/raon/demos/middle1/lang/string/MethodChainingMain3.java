package com.raon.demos.middle1.lang.string;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAddr adder = new ValueAddr();
        adder.add(1).add(2).add(3);
        int result = adder.getValue();
        System.out.println("result = " + result);
    }
}
