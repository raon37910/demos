package com.raon.demos.middle2.generic.ex1;

public class RawTypeMain {
    public static void main(String[] args) {
        GenericBox integeBox = new GenericBox();
        integeBox.setValue(10);
        Integer result = (Integer) integeBox.getValue();
        System.out.println("result = " + result);
    }
}
