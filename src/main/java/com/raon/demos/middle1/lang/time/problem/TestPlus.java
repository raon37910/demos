package com.raon.demos.middle1.lang.time.problem;

import java.time.LocalDateTime;
import java.time.Period;

public class TestPlus {
    public static void main(String[] args) {
        LocalDateTime base = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        LocalDateTime next = base.plusYears(1);
        next = next.plusMonths(2);
        next = next.plusDays(3);
        next = next.plusHours(4);

        System.out.println("기준 시각:" + base);
        System.out.println("1년 2개월 3일 4시간 후의 시각: " + next);
    }
}
