package com.raon.demos.middle1.lang.immutable.address.problem;

public class ImmutableMyDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(final int year, final int month, final int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmutableMyDate withYear(final int year) {
        return new ImmutableMyDate(year, month, day);
    }

    public ImmutableMyDate withMonth(final int newMonth) {
        return new ImmutableMyDate(year, newMonth, day);
    }

    public ImmutableMyDate withDay(final int newDay) {
        return new ImmutableMyDate(year, month, newDay);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
