package com.raon.demos.middle2.generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.setValue(10);
        Integer integer =  integerBox.getValue();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox();
        stringBox.setValue("hello");
        String str = (String) stringBox.getValue();
        System.out.println("str = " + str);

        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.setValue(10.5);
        Double doubleValue = doubleBox.getValue();
        System.out.println("doubleValue = " + doubleValue);
    }
}
