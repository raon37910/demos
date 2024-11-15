package com.raon.demos.middle1.lang.enumeration.ex3;

public class DiscountService {
    public int discount(Grade grade, int price) {
        int discountPercent = switch (grade) {
            case BASIC -> 10;
            case GOLD -> 20;
            case DIAMOND -> 30;
            case null -> 0;
        };

        return price * discountPercent / 100;
    }
}
