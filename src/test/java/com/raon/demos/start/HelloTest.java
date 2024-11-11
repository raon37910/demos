package com.raon.demos.start;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HelloTest {

    @Test
    @DisplayName("Hello World")
    void helloWorld() {
        System.out.println("Hello Java");
    }

    @Test
    @DisplayName("Hello World2")
    void helloWorld2() {
        System.out.println("Hello Java1");
        System.out.println("Hello Java2");
        System.out.println("Hello Java3");
    }
}
