package com.raon.demos.middle2.generic.ex4;

public class GenericMethod {
    public static Object objectMethod(Object object) {
        System.out.println("object = " + object);
        return object;
    }

    public static <T> T genericMethod(T t) {
        System.out.println("t = " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t) {
        System.out.println("bound = " + t);
        return t;
    }
}
