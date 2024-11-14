package com.raon.demos.basic.extends1.problem;

public class Album extends Item {
    private String artist;

    public Album(String name, int price, String artist) {
        super(name, price);
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 아티스트: " + artist);
    }
}
