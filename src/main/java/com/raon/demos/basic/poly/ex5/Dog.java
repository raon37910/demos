package com.raon.demos.basic.poly.ex5;


import com.raon.demos.basic.poly.ex4.AbstractAnimal;

public class Dog implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
