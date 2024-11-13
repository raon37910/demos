package com.raon.demos.basic.access.problem;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.count = 0;
        this.max = max;
    }

    public void increment() {
        if (count < max) {
            count++;
        } else {
            System.out.println("최대 값을 초과 할 수 없습니다.");
        }
    }

    public int getCount() {
        return count;
    }
}
