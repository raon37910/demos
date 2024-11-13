package com.raon.demos.basic.static2.problem;

public class Car {
    private String name;
    public static int count;

    public Car(String name) {
        this.name = name;
        count++;
        System.out.println("차량 구입, 이름: " + name);
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + count);
    }
}
