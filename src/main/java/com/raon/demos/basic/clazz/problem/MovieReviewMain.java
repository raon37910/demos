package com.raon.demos.basic.clazz.problem;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview mr1 = new MovieReview();
        mr1.title = "너의 이름은";
        mr1.review = "생각 보다 재밌었다";

        MovieReview mr2 = new MovieReview();
        mr2.title = "너의 이름은2";
        mr2.review = "생각 보다 재밌었다2";

        System.out.println(mr1.title);
        System.out.println(mr1.review);

        System.out.println(mr2.title);
        System.out.println(mr2.review);
    }
}
