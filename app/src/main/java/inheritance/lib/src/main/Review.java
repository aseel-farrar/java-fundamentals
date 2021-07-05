package inheritance.lib.src.main;

import java.util.ArrayList;

public class Review {
    private String body;
    private String author;
    private int starsNumberFromAuthor;
    private ArrayList<Review> reviews = new ArrayList<>();
    private int rate;
    private String movieName;

    public Review() {

    }

    public Review(String body, String author, int starsNumberFromAuthor) {
        this.body = body;
        this.author = author;
        this.starsNumberFromAuthor = starsNumberFromAuthor;

    }

    public Review(String body, String author, int starsNumberFromAuthor, String movieName) {
        this.body = body;
        this.author = author;
        this.starsNumberFromAuthor = starsNumberFromAuthor;
        this.movieName = movieName;
    }


    /**
     * method that add reviews and calculate the new Stars number for the restaurant,
     * and add the review to arrayList that used to contains the reviews
     *
     * @param body:                  Review Text
     * @param author:                Reviewer Name
     * @param starsNumberFromAuthor: Stars Number Given by the Reviewer
     */
    public void addReview(String body, String author, int starsNumberFromAuthor) {
        int total = 0;
        if (starsNumberFromAuthor < 0 || starsNumberFromAuthor > 5) {
            System.out.println("Sorry (*_*) " + starsNumberFromAuthor + " Invalid Stars Rate Number --> it's should be between 0 and 5, So it ");
        } else {
            Review newReview = new Review(body, author, starsNumberFromAuthor);
            reviews.add(newReview);
            for (Review rate : reviews) {
                total += rate.getStarsNumberFromAuthor();
            }
            rate = total / reviews.size();
        }
    }

    @Override
    public String toString() {
        return "\n" + author + "'s Review: \"" + body + "\"" +
                ", Stars Number From " + author + ": " + starsNumberFromAuthor;
    }


    public int getStarsNumberFromAuthor() {
        return starsNumberFromAuthor;
    }

    public void setStarsNumberFromAuthor(int starsNumberFromAuthor) {
        this.starsNumberFromAuthor = starsNumberFromAuthor;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
