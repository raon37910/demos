package com.raon.demos.start;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IfElse {

    private static final Logger logger = LoggerFactory.getLogger(IfElse.class);


    @Test
    void case1() {
        int age = 20;

        if (age >= 18) {
            logger.info("성인입니다.");
        }

        if (age < 18) {
            logger.info("미성년자입니다.");
        }
    }

    @Test
    void case2() {
        int age = 20;

        if (age >= 18) {
            logger.info("성인입니다.");
        } else {
            logger.info("미성년자입니다.");
        }
    }

    @Test
    void case3() {
        int age = 14;

        if (age <= 7) {
            logger.info("미취학");
        }

        if (age >= 8 && age <= 13) {
            logger.info("초등학생");
        }

        if (age >= 14 && age <= 16) {
            logger.info("중학생");
        }

        if (age >= 17 && age <= 19) {
            logger.info("고등학생");
        }

        if (age >= 20) {
            logger.info("성인");
        }
    }

    @Test
    void case4() {
        int age = 14;

        if (age <= 7) {
            logger.info("미취학");
        } else if (age <= 13) {
            logger.info("초등학생");
        } else if (age <= 16) {
            logger.info("중학생");
        } else if (age <= 19) {
            logger.info("고등학생");
        } else {
            logger.info("성인");
        }
    }

    @Test
    void case5() {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount += 1000;
            logger.info("10000원 이상 구매하여 1000원 할인");
        }

        if (age <= 10) {
            discount += 1000;
            logger.info("어린이 1000원 할인");
        }

        logger.info("총 할인 금액: {}원", discount);
    }

    @Test
    void case6() {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount += 1000;
            logger.info("10000원 이상 구매 1000원 할인");
        } else if (age <= 10) {
            discount += 1000;
            logger.info("어린이 1000원 할인");
        } else {
            logger.info("할인 없음");
        }

        logger.info("총 할인 금액: {}원", discount);
    }

    @Test
    void case7() {
        int grade = 2;

        int coupon;
        if (grade == 1) {
            coupon = 1000;
        } else if (grade == 2) {
            coupon = 2000;
        } else if (grade == 3) {
            coupon = 3000;
        } else {
            coupon = 500;
        }

        logger.info("발급 받은 쿠폰: {}", coupon);
    }

    @Test
    void case8() {
        int grade = 2;
        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };

        logger.info("발급 받은 쿠폰: {}", coupon);
    }

    @Test
    void case9() {
        int grade = 2;
        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2, 3 -> 2000;
            default -> 500;
        };

        logger.info("발급 받은 쿠폰: {}", coupon);
    }

    @Test
    void case10() {
        int age = 18;
        String status;

        if (age >= 18) {
            status = "성인";
        } else {
            status = "미성년자";
        }

        logger.info("age = {} status = {}", age, status);
    }

    @Test
    void case11() {
        int age = 18;
        String status = age >= 18 ? "성인" : "미성년자";

        logger.info("age = {} status = {}", age, status);
    }

    @Test
    void problem1() {
        int score = 100;
        String grade = switch (score / 10) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> "F";
        };

        logger.info("출력: 학점은 {}입니다.", grade);
    }

    @Test
    void problem2() {
        int distance = 10;
        String vehicle = "";

        if (distance <= 1) {
            vehicle = "도보";
        } else if (distance <= 10) {
            vehicle = "자전거";
        } else if (distance <= 100) {
            vehicle = "자동차";
        } else {
            vehicle = "비행기";
        }

        logger.info("출력: {}를 이용하세요.", vehicle);
    }

    @Test
    void problem3() {
        int dollar = 10;
        int answer = 0;

        if (dollar < 0) {
            logger.info("잘못된 금액입니다.");
        } else if (dollar == 0) {
            logger.info("환전할 금액이 없습니다.");
        } else {
            answer = dollar * 1300;
            logger.info("환전 금액은 {}원 입니다.", answer);
        }
    }

    @Test
    void problem4() {
        int score = 7;

        if (score <= 9) {
            logger.info("어바웃 타임");
        }

        if (score <= 8) {
            logger.info("토이스토리");
        }

        if (score <= 7) {
            logger.info("고릴라");
        }
    }

    @Test
    void problem5() {
        String grade = "A";
        String str = switch (grade) {
            case "A" -> "탁월한 성과입니다!";
            case "B" -> "좋은 성과입니다!";
            case "C" -> "준수한 성과입니다!";
            case "D" -> "향상이 필요합니다.";
            case "F" -> "불합격입니다.";
            default -> "잘못된 학점입니다.";
        };

        logger.info(str);
    }

    @Test
    void problem6() {
        int a = 10;
        int b = 20;
        int max = a > b ? a : b;
        logger.info("더 큰 숫자는 {}입니다.", max);
    }

    @Test
    void problem7() {
        int x = 2;
        String answer = x % 2 == 0 ? "짝수" : "홀수";
        logger.info("출력 x = {}, {}", x ,answer);
    }
}
