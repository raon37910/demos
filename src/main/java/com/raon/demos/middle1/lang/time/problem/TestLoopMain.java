package com.raon.demos.middle1.lang.time.problem;

import java.time.LocalDate;

public class TestLoopMain {
    public static void main(String[] args) {
        LocalDate base = LocalDate.of(2024, 1, 1);

        for (int i = 0; i < 5; i++) {
            System.out.println("날짜 " + i + ": " + base);
            base = base.plusDays(14);
        }
    }
}
