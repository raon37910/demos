package com.raon.demos.basic.oop1.problem;

public class Rectangle {
    int width;
    int height;

    public int getArea() {
        return width * height;
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }

    public boolean isSquare() {
        return width == height;
    }
}
