package com.raon.demos.basic.static2.problem;

public class MathArrayUtils {

    private MathArrayUtils() {}

    public static int sum(int[] array) {
        int sum = 0;

        for(int num: array) {
            sum += num;
        }

        return sum;
    }

    public static double average(int[] array) {
        return (double) sum(array) / array.length;
    }

    public static int min(int[] array) {
        int min = array[0];

        for(int i = 1; i < array.length; i++) {
            if(min > array[i]) {
                min = array[i];
            }
        }

        return min;
    }

    public static int max(int[] array) {
        int max = array[0];

        for(int i = 1; i < array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }
}
