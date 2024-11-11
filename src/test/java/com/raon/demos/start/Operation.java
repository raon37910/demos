package com.raon.demos.start;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Operation {

    private static final Logger logger = LoggerFactory.getLogger(Operation.class);

    @Test
    void operator1() {
        int a = 5;
        int b = 2;

        int sum = a + b;
        logger.info("a + b = {}", sum);

        int diff = a - b;
        logger.info("a - b = {}", diff);

        int multi = a * b;
        logger.info("a * b = {}", multi);

        int div = a / b;
        logger.info("a / b = {}", div);

        int mod = a % b;
        logger.info("a % b = {}", mod);
    }

    @Test
    void operator2() {
        String result1 = "hello " + "world";
        logger.info(result1);

        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        logger.info(result2);

        String result3 = "a + b = " + 10;
        logger.info(result3);

        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        logger.info(result4);
    }

    @Test
    @DisplayName("연산자 우선순위")
    void operator3() {
        int sum1 = 1 + 2 * 3;
        int sum2 = (1 + 2) * 3;

        logger.info("sum1 = {}", sum1);
        logger.info("sum2 = {}", sum2);
    }

    @Test
    @DisplayName("연산자 우선순위2")
    void operator4() {
        int sum3 = 2 * 2 + 3 * 3;
        int sum4 = (2 * 2) + (3 * 3);
        logger.info("sum3 = {}", sum3);
        logger.info("sum4 = {}", sum4);
    }

    @Test
    @DisplayName("증감연산자1")
    void operator5() {
        int a = 0;

        a = a + 1;
        logger.info("a = {}", a);
        a = a + 1;
        logger.info("a = {}", a);

        ++a;
        logger.info("a = {}", a);
        ++a;
        logger.info("a = {}", a);
    }

    @Test
    @DisplayName("증감연산자2")
    void operator6() {
        int a = 1;
        int b = 0;
        b = ++a;
        logger.info("a = {}, b = {}", a, b);

        a = 1;
        b = 0;
        b = a++;
        logger.info("a = {}, b = {}", a, b);
    }

    @Test
    @DisplayName("비교 연산자")
    void operator7() {
        int a = 2;
        int b = 3;

        logger.info("{}", a == b);
        logger.info("{}", a != b);
        logger.info("{}", a > b);
        logger.info("{}", a < b);
        logger.info("{}", a >= b);
        logger.info("{}", a <= b);

        boolean result = a == b;
        logger.info("{}" , result);
    }

    @Test
    @DisplayName("비교 연산자2")
    void operator8() {
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello".equals("hello");
        boolean result2 = str1.equals("문자열1");
        boolean result3 = str1.equals(str2);

        logger.info("result1 = {}", result1);
        logger.info("result2 = {}", result2);
        logger.info("result3 = {}", result3);
    }

    @Test
    @DisplayName("논리 연산자")
    void operator9() {
        logger.info("&&: AND 연산");
        logger.info("{}", true && true);
        logger.info("{}", true && false);
        logger.info("{}", false && false);
        logger.info("");

        logger.info("||: OR 연산");
        logger.info("{}", true || true);
        logger.info("{}", true || false);
        logger.info("{}", false || false);
        logger.info("");

        logger.info("! 연산");
        logger.info("{}", !true);
        logger.info("{}", !false);
        logger.info("");

        logger.info("변수 활용");
        boolean a = true;
        boolean b = false;

        logger.info("{}", a && b);
        logger.info("{}", a || b);
        logger.info("{}", !a);
        logger.info("{}", !b);
    }

    @Test
    @DisplayName("로직 활용")
    void operator10() {
        int a = 15;
        boolean result = a > 10 && a < 20;
        logger.info("result = {}", result);
    }

    @Test
    @DisplayName("할당 연산자")
    void operator11() {
        int a = 5;
        a += 3;
        a -= 2;
        a *= 4;
        a /= 3;
        a %= 5;

        logger.info("{}", a);
    }

    @Test
    @DisplayName("문제 1")
    void problem1() {
        int num1 = 10, num2 = 20, num3 = 30;
        int sum = num1 + num2 + num3;
        int avg = sum / 3;

        logger.info("sum = {}", sum);
        logger.info("avg = {}", avg);
    }

    @Test
    @DisplayName("문제 2")
    void problem2() {
        double num1 = 1.5, num2 = 2.5, num3 = 3.5;
        double sum = num1 + num2 + num3;
        double avg = sum / 3;

        logger.info("sum = {}", sum);
        logger.info("avg = {}", avg);
    }

    @Test
    @DisplayName("문제 3")
    void problem3() {
        int score = 50;
        logger.info("{}", (score >= 80 && score <= 100));
    }
}
