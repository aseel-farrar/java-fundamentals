package inheritance.lib.src.main;

import java.util.ArrayList;

public class Theater extends Review {
    private String name;
    private ArrayList<String> allMovies = new ArrayList<>();
    private ArrayList<Review> theaterReviewsWitheMovies = new ArrayList<>();

    public Theater(String name) {
        this.name = name;
    }

    public void addMovie(String movieName) {
        allMovies.add(movieName);
    }

    public void removeMovie(String movieName) {
        allMovies.remove(movieName);
    }

    public void addReview(String body, String author, int starsNumberFromAuthor, String movieName) {
        int total = 0;
        if (starsNumberFromAuthor < 0 || starsNumberFromAuthor > 5) {
            System.out.println("Sorry (*_*) " + starsNumberFromAuthor + " Invalid Stars Rate Number --> it's should be between 0 and 5, So it ");
        } else {
            Review newReview = new Review(body, author, starsNumberFromAuthor, movieName);
            theaterReviewsWitheMovies.add(newReview);
            for (Review rate : getReviews()) {
                total += rate.getStarsNumberFromAuthor();
            }
            for (Review rate : theaterReviewsWitheMovies) {
                total += rate.getStarsNumberFromAuthor();
            }
            setRate(total / (getReviews().size() + theaterReviewsWitheMovies.size()));
        }
    }

    @Override
    public String toString() {
        if (getReviews().size() != 0) {
            return new StringBuilder().append("Theater Name: \"").append(name).append("\"").append(",\n").append(name).append(" All Movies: ").append(allMovies).append(",\n").append("Users Rating: ").append(getRate()).append("\n").append("Users Reviews: ").append(getReviews().toString()).toString() + theaterReviewsWitheMovies;
        } else {
            return "Theater Name='" + name + '\'' + "\n" +
                    ", All Movies: " + allMovies;
        }
    }
}
