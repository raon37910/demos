package com.raon.demos.middle2.collection.set;

import java.util.Arrays;

public class HashStartV4 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        Integer[] inputArray = new Integer[CAPACITY];

        add(inputArray, 1);
        add(inputArray, 2);
        add(inputArray, 5);
        add(inputArray, 8);
        add(inputArray, 14);
        add(inputArray, 99);

        System.out.println(Arrays.toString(inputArray));

        int searchValue = 14;
        int hashIndex = hashIndex(searchValue);

        Integer result = inputArray[hashIndex];
        System.out.println(result);

    }

    private static void add(Integer[] inputArray, int value) {
        int hashIndex = hashIndex(value);
        inputArray[hashIndex] = value;
    }

    public static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
