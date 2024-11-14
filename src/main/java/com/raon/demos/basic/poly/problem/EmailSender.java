package com.raon.demos.basic.poly.problem;

public class EmailSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email: " + message);
    }
}
