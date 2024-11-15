package com.raon.demos.middle1.lang.wrapper;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        System.out.println("System.getenv() = " + System.getenv());

        System.out.println("System.getProperties() = " + System.getProperties());
        System.out.println("System.getProperty(\"java.version\") = " + System.getProperty("java.version"));

        char[] originArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originArray, 0, copiedArray, 0, originArray.length);

        System.out.println("copiedArray = " + copiedArray);
        System.out.println("Arrays.toString(copiedArray) = " + Arrays.toString(copiedArray));

        System.exit(0);
    }
}
