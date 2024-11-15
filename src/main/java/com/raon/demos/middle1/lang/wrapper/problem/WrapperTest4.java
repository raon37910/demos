package com.raon.demos.middle1.lang.wrapper.problem;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";

        Integer i = Integer.valueOf(str);
        int pr = i;
        Integer nx = pr;

        System.out.println(i);
        System.out.println(pr);
        System.out.println(nx);
    }
}
