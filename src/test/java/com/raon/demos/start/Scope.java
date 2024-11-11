package com.raon.demos.start;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Scope {

    private static final Logger logger = LoggerFactory.getLogger(Scope.class);

    @Test
    void ex1() {
        int m = 10;
        if (true) {
            int x = 20;
            logger.info("if m = {}", m);
            logger.info("if x = {}", x);
        }

        logger.info("main m = {}", m);
//        logger.info("main x = {}", x);
    }

    @Test
    void ex2() {
        int m = 10;
        for (int i = 0; i < 2; i++) {
            logger.info("for m = {}", m);
            logger.info("for i = {}", i);
        }

        logger.info("for m = {}", m);
//        logger.info("for i = {}", i);
    }

    @Test
    void ex3() {
        int m = 10;
        int temp = 0;
        if (m > 0) {
            temp = m * 2;
            logger.info("temp = {}", temp);
        }

        logger.info("m = {}", m);
    }

    @Test
    void ex4() {
        int m = 10;
        if (m > 0) {
            int temp = m * 2;
            logger.info("temp = {}", temp);
        }

        logger.info("m = {}", m);
    }

    @Test
    void ex5() {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;
        logger.info("longValue = {}", longValue);

        doubleValue = intValue;
        logger.info("doubleValue = {}", doubleValue);

        doubleValue = 20L;
        logger.info("doubleValue = {}", doubleValue);
    }

    @Test
    void ex6() {
        double doubleValue = 1.5;
        int intValue = 0;

//        intValue = doubleValue;
        intValue = (int) doubleValue;
        logger.info("intValue = {}", intValue);
    }

    @Test
    void ex7() {
        long maxIntValue = 2147483647;
        long maxIntOver = 2147483648L;
        int intValue = 0;

        intValue = (int) maxIntValue;
        logger.info("maxIntValue casting = {}", intValue);

        intValue = (int) maxIntOver;
        logger.info("maxIntOver casting = {}", intValue);
    }

    @Test
    void ex8() {
        int div1 = 3 / 2;
        logger.info("div1 = {}", div1);

        double div2 = 3 / 2;
        logger.info("div2 = {}", div2);

        double div3 = 3.0 / 2;
        logger.info("div3 = {}", div3);

        double div4 = (double) 3 / 2;
        logger.info("div4 = {}", div4);

        int a = 3;
        int b = 2;
        double result = (double) a / b;
        logger.info("result = " + result);
    }
}
