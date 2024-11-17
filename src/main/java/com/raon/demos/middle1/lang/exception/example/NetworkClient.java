package com.raon.demos.middle1.lang.exception.example;

public class NetworkClient {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClient(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientException {
        if (connectError) {
            throw new NetworkClientException("connectError", address + " 서버 연결 실패");
        }

        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws NetworkClientException {
        if (sendError) {
            throw new NetworkClientException("sendError", address + " 서버에 데이터 전송 실패: " + data);
        }

        System.out.println(address + " 서버에 데이터 전송: " + data);
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }

        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
