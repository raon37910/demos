package com.raon.demos.basic.access.problem;

public class Item {
    private String name;
    private Integer price;
    private Integer quantity;

    public Item(String name, Integer price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
