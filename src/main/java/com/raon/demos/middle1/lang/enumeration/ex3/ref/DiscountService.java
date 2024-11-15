package com.raon.demos.middle1.lang.enumeration.ex3.ref;

public class DiscountService {
    public int discount(Grade grade, int price) {
        return grade.discount(price);
    }
}
