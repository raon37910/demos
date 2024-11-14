package com.raon.demos.basic.poly.ex4;

import com.raon.demos.basic.poly.ex3.AbstractAnimal;
import com.raon.demos.basic.poly.ex3.Cat;
import com.raon.demos.basic.poly.ex3.Caw;
import com.raon.demos.basic.poly.ex3.Dog;

public class AbstractMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        AbstractAnimal[] animals = {dog, cat, caw};

        for(AbstractAnimal animal: animals) {
            soundAnimal(animal);
            moveAnimal(animal);
        }

    }
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}
