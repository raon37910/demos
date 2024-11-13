package com.raon.demos.basic.ref.problem;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] productOrders = {
                createOrder("두부", 2000, 2),
                createOrder("김치", 5000, 1),
                createOrder("콜라", 1500, 2)
        };

        printOrders(productOrders);
        System.out.println("총 결제 금액:" + getTotalAmount(productOrders));
    }

    public static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    public static void printOrders(ProductOrder[] productOrders) {
        for(ProductOrder p: productOrders) {
            System.out.println("상품명: " + p.productName + ", 가격: " + p.price + ", 수량: " + p.quantity);
        }
    }

    public static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;

        for(ProductOrder p: orders) {
            totalAmount += p.price * p.quantity;
        }

        return totalAmount;
    }
}
