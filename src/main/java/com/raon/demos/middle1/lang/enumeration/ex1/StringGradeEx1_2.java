package com.raon.demos.middle1.lang.enumeration.ex1;

public class StringGradeEx1_2 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();

        int vip = discountService.discount("VIP", price);
        System.out.println("vip = " + vip);

        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("diamondd = " + diamondd);

        int gold = discountService.discount("gold", price);
        System.out.println("gold = " + gold);
    }
}
