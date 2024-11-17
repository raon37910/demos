package com.raon.demos.middle1.lang.exception.example;

public class NetworkClientException extends Exception {
    private String errorCode;

    public NetworkClientException(String errorCode, String messages) {
        super(messages);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
