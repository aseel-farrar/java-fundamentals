package inheritance.lib.src.main;

import java.util.ArrayList;

/**
 * Restaurant class
 */
public class Restaurant extends Review {
    private String restaurantName;
    private int starsNumber;
    private double price;
    private ArrayList<Review> reviews = new ArrayList<>();

    /**
     * constructor that takes the following params
     *
     * @param body:                  Review Text
     * @param author:                Reviewer Name
     * @param starsNumberFromAuthor: Stars Number Given by the Reviewer
     * @param restaurantName:        Restaurant Name
     * @param starsNumber:           Restaurant Stars Number
     * @param price:                 Price
     */
    public Restaurant(String body, String author, int starsNumberFromAuthor, String restaurantName, int starsNumber, double price) {
        super(body, author, starsNumberFromAuthor);
        this.restaurantName = restaurantName;
        this.starsNumber = starsNumber;
        this.price = price;
    }

    /**
     * constructor that takes the following params
     *
     * @param restaurantName:Restaurant Name
     * @param starsNumber:Restaurant    Stars Number
     * @param price:Price
     */
    public Restaurant(String restaurantName, int starsNumber, double price) {
        this.restaurantName = restaurantName;
        this.starsNumber = starsNumber;
        this.price = price;
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
        if (starsNumberFromAuthor < 0 || starsNumberFromAuthor > 5) {
            System.out.println("Sorry (*_*) "+starsNumberFromAuthor + " Stars Number Not valid --> it's should be between 0 and 5, So it ");
//            starsNumberFromAuthor = this.starsNumber;
        }else {
            Review newReview = new Review(body, author, starsNumberFromAuthor);
            reviews.add(newReview);
            this.starsNumber = (starsNumberFromAuthor + this.starsNumber) / 2;
        }
    }

    /**
     * @return: the restaurant information and all the reviews for it
     */
    @Override
    public String toString() {
        if (reviews.size() != 0) {
            return new StringBuilder().append("Restaurant Name: \"").append(restaurantName).append("\"").append(",\n").append(restaurantName).append(" Stars Number: ").append(starsNumber).append(",\n").append("price: ").append(price).append(",\n").append(reviews.toString()).toString();
        } else {
            return "Restaurant Name: \"" + restaurantName + "\"" + ",\n" +
                    restaurantName + " Stars Number: " + starsNumber + ",\n" +
                    "price: " + price;
        }
    }

    /**
     * Setters & Getters
     */
    public int getStarsNumber() {
        return starsNumber;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public double getPrice() {
        return price;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
}
