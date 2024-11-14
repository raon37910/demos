package com.raon.demos.basic.poly.problem;

public class SendMain {
    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new FaceBookSender(), new SmsSender()};

        for(Sender sender: senders) {
            sender.sendMessage("환영합니다!");
        }
    }
}
