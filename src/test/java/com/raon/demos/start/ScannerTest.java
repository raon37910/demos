package com.raon.demos.start;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class ScannerTest {

    Scanner sc;

    @Test
    void ex1() {
        System.out.print("문자열을 입력하세요:");
        setInput("test");
        String str = sc.nextLine();
        System.out.println("입력한 문자열:" + str);

        System.out.print("정수를 입력하세요:");
        setInput("10");
        int intValue = sc.nextInt();
        System.out.println("입력한 정수: " + intValue);

        System.out.print("실수를 입력하세요:");
        setInput("10.0");
        double doubleValue = sc.nextDouble();
        System.out.println("입력한 실수: " + doubleValue);
    }

    @Test
    void ex2() {
        setInput("10\n");
        int a = sc.nextInt();

        setInput("20\n");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("두 숫자의 합: " + sum);
    }

    @Test
    void ex3() {
        setInput("10");
        int a = sc.nextInt();

        setInput("20");
        int b = sc.nextInt();

        int max = a > b ? a : b;
        System.out.println("더 큰 숫자:" + max);
    }



    /**
     * System.setIn을 이용하면 인풋 스트림을 다시 세팅 할 수 있다.
     * 해당 인풋 스트림을 가지는 입력 객체를 만들면 Junit에서도 입력 값을 받는 테스트를 작성 할 수 있다.
     */
    private void setInput(String str) {
        System.setIn(new ByteArrayInputStream(str.getBytes()));
        sc = new Scanner(System.in);
    }
}
