package com.raon.demos.middle2.generic.ex4;

import com.raon.demos.middle2.generic.animal.Cat;
import com.raon.demos.middle2.generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 100);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("멍멍이2", 200);
        Dog bigger = AnimalMethod.bigger(dog, targetDog);
        System.out.println("bigger = " + bigger);
    }
}
