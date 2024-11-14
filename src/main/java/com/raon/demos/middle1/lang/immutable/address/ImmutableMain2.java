package com.raon.demos.middle1.lang.immutable.address;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutalbeObj obj1 = new ImmutalbeObj(10);
        obj1.add(10);

        System.out.println("obj1 = " + obj1.getValue());
    }
}
