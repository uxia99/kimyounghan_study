package intermediate.class1;

public class MovieReviewMain2 {

    public static void main(String[] args) {
        MovieReview movie1 = new MovieReview();
        movie1.title = "인셉션";
        movie1.review = "인생은 무한루프";

        MovieReview movie2 = new MovieReview();
        movie2.title = "어바웃타임";
        movie2.review = "인생 시간 영화";

        MovieReview[] movies = new MovieReview[] {movie1, movie2};

        for (MovieReview m : movies) {
            System.out.println("영화 제목 : " + m.title + ", 리뷰 : " + m.review);
        }
    }
}
