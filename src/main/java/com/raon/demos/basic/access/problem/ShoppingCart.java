package com.raon.demos.basic.access.problem;

public class ShoppingCart {
    private Item[] items;
    private int cur;

    public ShoppingCart() {
        items = new Item[10];
        cur = 0;
    }

    public void addItem(Item item) {
        if (cur > 10) {
            System.out.println("쇼핑 카트가 가득 찼습니다.");
            return;
        }

        items[cur++] = item;
    }

    public void displayItems() {
        int totalPrice = 0;

        for(int i = 0; i < cur; i++) {
            Item item = items[i];
            int total = item.getPrice() * item.getQuantity();
            totalPrice += total;

            System.out.println("상품명:" + item.getName() + ", 합계:" + total);
        }

        System.out.println("전체 가격 합: " + totalPrice);
    }
}
