package com.raon.demos.basic.poly.problem;

public class SmsSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS: " + message);
    }
}
