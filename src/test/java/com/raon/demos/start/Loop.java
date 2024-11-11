package com.raon.demos.start;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Loop {

    private static final Logger logger = LoggerFactory.getLogger(Loop.class);

    @Test
    void case1() {
        int count = 0;

        count = count + 1;
        logger.info("현재 숫자는: {}", count);

        count = count + 1;
        logger.info("현재 숫자는: {}", count);

        count = count + 1;
        logger.info("현재 숫자는: {}", count);
    }

    @Test
    void case2() {
        int count = 0;

        while (count < 3) {
            count++;
            logger.info("현재 숫자는: {}", count);
        }
    }

    @Test
    void case3() {
        int sum = 0;
        sum = sum + 1;
        logger.info("i = {}, sum = {}", 1, sum);

        sum = sum + 2;
        logger.info("i = {}, sum = {}", 2, sum);

        sum = sum + 3;
        logger.info("i = {}, sum = {}", 3, sum);
    }

    @Test
    void case4() {
        int sum = 0;
        int i = 10;

        sum = sum + i;
        logger.info("i = {}, sum = {}", i, sum);
        i++;

        sum = sum + i;
        logger.info("i = {}, sum = {}", i, sum);
        i++;

        sum = sum + i;
        logger.info("i = {}, sum = {}", i, sum);
    }

    @Test
    void case5() {
        int sum = 0;
        int i = 1;
        int endNum = 3;

        sum = sum + i;
        logger.info("i = {} sum = {}", i, sum);
        i++;

        sum = sum + i;
        logger.info("i = {} sum = {}", i, sum);
        i++;

        sum = sum + i;
        logger.info("i = {} sum = {}", i, sum);
    }

    @Test
    void case6() {
        int sum = 0;
        int i = 10;
        int endNum = 12;

        while (i <= endNum) {
            sum = sum + i;
            logger.info("i = {} sum = {}", i, sum);
            i++;
        }
    }

    @Test
    void case7() {
        int i = 10;
        while (i < 3) {
            logger.info("현재 숫자는: {}", i);
            i++;
        }
    }

    @Test
    void case8() {
        int i = 10;
        do {
            logger.info("현재 숫자는: {}", i);
            i++;
        } while (i < 3);
    }

    @Test
    void case9() {
        int sum = 0;
        int i = 1;

        while (true) {
            sum += i;
            if (sum > 10) {
                logger.info("합이 10 보다 크면 종료: i = {} sum = {}", i, sum);
                break;
            }
            i++;
        }
    }

    @Test
    void case10() {
        int i = 1;

        while (i <= 5) {
            if (i == 3) {
                i++;
                continue;
            }
            logger.info("{}", i);
            i++;
        }
    }

    @Test
    void case11() {
        for(int i = 1; i <= 10; i++) {
            logger.info("{}", i);
        }
    }

    @Test
    void case12() {
        int sum = 0;
        int endNum = 3;

        for (int i = 1; i <= endNum; i++) {
            sum = sum + i;
            logger.info("i = {} sum = {}", i, sum);
        }
    }

    @Test
    void case13() {
        int sum = 0;
        int i = 1;

        for(; ;) {
            sum += i;
            if (sum > 10) {
                logger.info("합이 10보다 크면 종료 i={} sum={}", i, sum);
                break;
            }
            i++;
        }
    }

    @Test
    void case14() {
        int sum = 0;

        for(int i = 1; ; i++) {
            sum += i;
            if (sum > 10) {
                logger.info("합이 10보다 크면 종료 i={} sum={}", i, sum);
                break;
            }
        }
    }

    @Test
    void case15() {
        for(int i = 0; i < 2; i++) {
            logger.info("외부 for 시작 i:{}", i);

            for(int j = 0; j < 3; j++) {
                logger.info("-> 내부 for {} - {}", i, j);
            }

            logger.info("외부 for 종료 i:{}", i);
            logger.info("");
        }
    }

    @Test
    void problem1() {
        for(int count = 1; count <= 10; count++) {
            logger.info("{}", count);
        }
    }

    @Test
    void problem1_1() {
        int count = 1;

        while (count <= 10) {
            logger.info("{}", count);
            count++;
        }
    }

    @Test
    void problem2() {
        for(int num = 2; num <= 20; num += 2) {
            logger.info("{}", num);
        }
    }

    @Test
    void problem2_2() {
        int num = 2;

        while (num <= 20) {
            logger.info("{}", num);
            num += 2;
        }
    }

    @Test
    void problem3() {
        int max = 3;
        int sum = 0;

        for(int i = 1; i <= max; i++) {
            sum += i;
        }

        logger.info("{}", sum);
    }

    @Test
    void problem3_2() {
        int max = 3;
        int sum = 0;
        int i = 1;

        while (i <= max) {
            sum += i;
            i++;
        }

        logger.info("{}", sum);
    }

    @Test
    void problem4() {
        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                logger.info("{} * {} = {}", i, j, i * j);
            }
        }
    }

    @Test
    void problem5() {
        int rows = 3;

        for(int i = 1; i <= rows; i++) {
            logger.info("*".repeat(Math.max(0, i)));
        }
    }
}
