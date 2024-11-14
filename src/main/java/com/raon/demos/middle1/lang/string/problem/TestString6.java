package com.raon.demos.middle1.lang.string.problem;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int cnt = 0;
        while (str.contains(key)) {
            int index = str.indexOf(key);
            str = str.substring(index);
            cnt++;
        }
        System.out.println("cnt = " + cnt);
    }
}
