package com.raon.demos.middle1.lang.exception.checked;

public class CheckedThrowMain {
    public static void main(String[] args) throws Exception {
        Service service = new Service();
        service.callThrow();
        System.out.println("정상 종료");
    }
}
