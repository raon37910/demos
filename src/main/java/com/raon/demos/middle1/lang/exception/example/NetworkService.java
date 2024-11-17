package com.raon.demos.middle1.lang.exception.example;

public class NetworkService {
    public void sendMessage(String data) throws NetworkClientException {
        String address = "http://example.com";

        NetworkClient client = new NetworkClient(address);
        client.initError(data);
        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientException e) {
            System.out.println(e);
        } finally {
            client.disconnect();
        }


    }
}
