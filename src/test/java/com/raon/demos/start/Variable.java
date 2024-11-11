package com.raon.demos.start;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Variable {

    private static final Logger log = LoggerFactory.getLogger(Variable.class);

    @Test
    @DisplayName("변수 없을 떄")
    void noVar() {
        log.info(10 + "");
        log.info(10 + "");
        log.info(10 + "");
    }

    @Test
    @DisplayName("변수 없을 때 값을 바꾸려면 일일이 다 바꿔줘야 한다.")
    void noVarChange() {
        log.info(20 + "");
        log.info(20 + "");
        log.info(20 + "");
    }

    @Test
    @DisplayName("변수 도입")
    void useVar() {
        int a = 10;
        log.info("{}", a);
        log.info("{}", a);
        log.info("{}", a);
    }

    @Test
    @DisplayName("변수 도입 값 변경")
    void useVarChange() {
        int a = 20;
        log.info("{}", a);
        log.info("{}", a);
        log.info("{}", a);
    }

    @Test
    @DisplayName("변수 값 변경")
    void useVarChange2() {
        int a; // 변수 선언
        a = 10; // 변수 초기화
        log.info("{}", a);
        a = 50;
        log.info("{}", a);
    }

    @Test
    @DisplayName("변수 선언")
    void var() {
        int a;
        int b;

        int c, d;
    }

    @Test
    @DisplayName("변수 초기화")
    void init() {
        // 변수 선언 과 초기화 분리
        int a;
        a = 1;
        log.info("{}", a);

        int b = 2; // 선언과 동시에 초기화
        log.info("{}", b);

        int c = 3, d = 4; // 여러 변수 선언과 초기화를 한번에
        log.info("{}", c);
        log.info("{}", d);
    }

    @Test
    @DisplayName("초기화 되지 않은 변수는 사용하면 컴파일 에러가 발생한다.")
    void noInit() {
        int a;
//        log.info("{}", a); 주석 풀면 컴파일 에러 발생함.
    }

    @Test
    @DisplayName("변수에는 다양한 타입이 존재한다.")
    void types() {
        int a = 100; // 정수
        double b = 10.5; // 실수
        boolean c = true;
        char d = 'A';
        String e = "Java";

        log.info("{}", a);
        log.info("{}", b);
        log.info("{}", c);
        log.info("{}", d);
        log.info("{}", e);
    }

    @Test
    @DisplayName("숫자 타입을 살펴본다.")
    void numberTypes() {
        byte b = 127;
        short s = 32767;
        int i = 2147483647;

        long l = 9223372036854775807L;

        float f = 10.0f;
        double d = 10.0;
    }

    @Test
    @DisplayName("연습문제 1")
    void problem1() {
        int num1 = 4;
        int num2 = 3;
        log.info("{}", (num1 + num2));
        log.info("{}", (num1 - num2));
        log.info("{}", (num1 * num2));
    }

    @Test
    @DisplayName("연습문제 2")
    void problem2() {
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;

        log.info("{}", sum);
    }

    @Test
    @DisplayName("연습문제 3")
    void problem3() {
        long num = 10000000000L;
        boolean b = true;

        log.info("{}", num);
        log.info("{}", b);
    }
}
