package com.raon.demos.middle1.lang.string;

public class StringSearchMain {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java world.";

        System.out.println("str.contains(\"Java\") = " + str.contains("Java"));
        System.out.println("str.indexOf(\"Java\") = " + str.indexOf("Java"));
        System.out.println("str.indexOf(\"Java\", 10) = " + str.indexOf("Java", 10));
        System.out.println("str.lastIndexOf(\"Java\") = " + str.lastIndexOf("Java"));

    }
}
