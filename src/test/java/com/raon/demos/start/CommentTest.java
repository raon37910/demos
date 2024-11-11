package com.raon.demos.start;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CommentTest {

    @Test
    @DisplayName("주석으로 감싸진 코드는 실행되지 않는다.")
    void commentTest() {
        System.out.println("hello java1");
//        System.out.println("hello java2");

        /**
         * System.out.println("hello java2");
         * System.out.println("hello java2");
         * System.out.println("hello java2");
         * System.out.println("hello java2");
         */
    }
}
