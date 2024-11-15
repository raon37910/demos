package com.raon.demos.middle1.lang.wrapper.problem;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        Integer i = Integer.valueOf(str);
        System.out.println(i);

        int pr = i.intValue();
        System.out.println(pr);

        System.out.println(Integer.valueOf(pr));
    }
}
