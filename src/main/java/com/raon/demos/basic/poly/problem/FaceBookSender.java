package com.raon.demos.basic.poly.problem;

public class FaceBookSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("facebook: " + message);
    }
}
