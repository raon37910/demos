package com.raon.demos.middle1.lang.time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportMain1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int minute = now.get(ChronoField.SECOND_OF_MINUTE);
        System.out.println("minute = " + minute);
    }
}