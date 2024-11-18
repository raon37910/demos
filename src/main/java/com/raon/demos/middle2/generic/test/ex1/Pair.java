package com.raon.demos.middle2.generic.test.ex1;

public class Pair <T, U> {
    private T first;
    private U Second;

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return Second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(U second) {
        Second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", Second=" + Second +
                '}';
    }
}
