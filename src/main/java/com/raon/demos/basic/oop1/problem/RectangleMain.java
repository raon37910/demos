package com.raon.demos.basic.oop1.problem;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;

        int area = rectangle.getArea();
        System.out.println("넓이 = " + area);

        int perimeter = rectangle.getPerimeter();
        System.out.println("둘레 =" + perimeter);

        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부:" + square);
    }
}
