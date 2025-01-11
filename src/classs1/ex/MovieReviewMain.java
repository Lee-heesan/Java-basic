package classs1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movie1 = new MovieReview();
        movie1.title= "영화 제목1";
        movie1.review= "영화1 리뷰";

        MovieReview movie2 = new MovieReview();
        movie2.title= "영화 제목2";
        movie2.review= "영화2 리뷰";

        MovieReview [] movieReviews = {movie1,movie2};

        for(MovieReview i : movieReviews){
            System.out.println("영화 제목 : "+ i.title + " 리뷰 : "+ i.review);
        }
    }
}
