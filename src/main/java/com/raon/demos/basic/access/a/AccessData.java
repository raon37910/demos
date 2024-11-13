package com.raon.demos.basic.access.a;

public class AccessData {
    public int publicField;
    int defaultValue;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicMethod호출" + publicField);
    }

    void defaultMethod() {
        System.out.println("defaultMethod 호출 " + defaultValue);
    }

    private void privateMethod() {
        System.out.println("privateMethod 호출" + privateField);
    }

    public void innerAccess() {
        System.out.println("내부 호출");
        publicField = 100;
        defaultValue = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
