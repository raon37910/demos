package com.raon.demos.basic.clazz.problem;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview mr1 = new MovieReview();
        mr1.title = "너의 이름은";
        mr1.review = "생각 보다 재밌었다";

        MovieReview mr2 = new MovieReview();
        mr2.title = "너의 이름은2";
        mr2.review = "생각 보다 재밌었다2";

        MovieReview[] mrs = {mr1, mr2};

        for (MovieReview mr: mrs) {
            System.out.println(mr.title);
            System.out.println(mr.review);
        }

    }
}
