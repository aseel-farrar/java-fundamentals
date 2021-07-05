package inheritance.lib.src.main;


/**
 * Restaurant class
 */
public class Restaurant extends Review {
    private String restaurantName;
    private int starsNumber;
    private double price;

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
     * @return: the restaurant information and all the reviews for it
     */
    @Override
    public String toString() {
        if (getReviews().size() != 0) {
            return new StringBuilder().append("Restaurant Name: \"").append(restaurantName).append("\"").append(",\n").append(restaurantName).append(" Stars Number: ").append(starsNumber).append(",\n").append("price: ").append(price).append(",\n").append(" Users Rating: ").append(getRate()).append("\n").append("Users Reviews: ").append(getReviews().toString()).toString();

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

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
}
