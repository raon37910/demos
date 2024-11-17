package com.raon.demos.middle1.lang.exception.checked;

public class Client2 {
    public void call () {
        throw new MyUncheckedException("ex");
    }
}
