package com.raon.demos.basic.ref.problem;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt();
        ProductOrder[] productOrders = new ProductOrder[n];

        for(int i = 0; i < n; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명:");
            String productName = scanner.next();

            System.out.print("가격:");
            int price = scanner.nextInt();

            System.out.print("수량:");
            int quantity = scanner.nextInt();

            productOrders[i] = createOrder(productName, price, quantity);
        }

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
