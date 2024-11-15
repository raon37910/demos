package com.raon.demos.middle1.lang.enumeration.ex0;

public class StringGradeEx0_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int vip = discountService.discount("VIP", price);
        int gold = discountService.discount("gold", price);
        int diamondd = discountService.discount("DIAMONDD", price);

        System.out.println("vip = " + vip);
        System.out.println("gold = " + gold);
        System.out.println("diamondd = " + diamondd);
    }
}
