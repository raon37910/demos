package com.raon.demos.middle1.lang.string.problem;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        System.out.println(str.substring(str.indexOf(ext), str.indexOf(ext) + ext.length()));
    }
}
