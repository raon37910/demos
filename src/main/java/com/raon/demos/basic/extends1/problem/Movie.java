package com.raon.demos.basic.extends1.problem;

public class Movie extends Item {
    private String director;
    private String actor;

    public Movie(String name, int price, String director, String actor) {
        super(name, price);
        this.director = director;
        this.actor = actor;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDirector() {
        return director;
    }

    public String getActor() {
        return actor;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 감독:" + director + ", 배우:" + actor);
    }
}
