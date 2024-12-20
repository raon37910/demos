package com.raon.demos.middle1.lang.immutable.address;

public class ImmutalbeObj {
    private final int value;

    public ImmutalbeObj(int value) {
        this.value = value;
    }

    public ImmutalbeObj add(int addValue) {
        int result = value + addValue;
        return new ImmutalbeObj(result);
    }

    public int getValue() {
        return value;
    }
}
