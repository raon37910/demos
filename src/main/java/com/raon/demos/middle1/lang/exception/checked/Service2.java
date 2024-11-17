package com.raon.demos.middle1.lang.exception.checked;

public class Service2 {
    Client2 client = new Client2();

    public void callCatch() {
        try {
            client.call();
        } catch (MyUncheckedException e) {
            System.out.println("예외 처리, message = " + e.getMessage());
        }

        System.out.println("정상 로직");
    }

    public void callThrow() {
        client.call();
    }
}
