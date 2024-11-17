package com.raon.demos.middle1.lang.exception.checked;

public class Main2 {
    public static void main(String[] args) {
        Service2 service = new Service2();
        service.callCatch();
        System.out.println("정상 종료");
    }
}
