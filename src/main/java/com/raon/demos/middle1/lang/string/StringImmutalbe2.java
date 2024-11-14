package com.raon.demos.middle1.lang.string;

public class StringImmutalbe2 {
    public static void main(String[] args) {
        String str = "hello";
        str = str.concat(" java");
        System.out.println("str = " + str);
    }
}
