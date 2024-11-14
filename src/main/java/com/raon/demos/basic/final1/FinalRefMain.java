package com.raon.demos.basic.final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();

        // 참조가 변경 불가능한것이지 안쪽은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
