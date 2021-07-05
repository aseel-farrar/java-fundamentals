package inheritance.lib.src.main;

public class Shop extends Review {
    String shopName;
    String description;
    double numberOfDollarSigns;

    public Shop(String shopName, String description, double numberOfDollarSigns) {
        this.shopName = shopName;
        this.description = description;
        this.numberOfDollarSigns = numberOfDollarSigns;
    }

    public Shop(String body, String author, int starsNumberFromAuthor, String shopName, String description, double numberOfDollarSigns) {
        super(body, author, starsNumberFromAuthor);
        this.shopName = shopName;
        this.description = description;
        this.numberOfDollarSigns = numberOfDollarSigns;
    }

    @Override
    public String toString() {
        if (getReviews().size() != 0) {
            return new StringBuilder().append("Shop Name: \"").append(shopName).append("\"").append(",\n").append(shopName).append(" Description: ").append(description).append(",\n").append("Number Of Dollar Signs: ").append(numberOfDollarSigns).append(",\n").append("Users Rating: ").append(getRate()).append("\n").append("Users Reviews: ").append(getReviews().toString()).toString();

        } else {
            return "Shop Name: " + shopName + ",\n" +
                    shopName + " Description: " + description + ",\n" +
                    "Number Of Dollar Signs: " + numberOfDollarSigns;
        }

    }


    public String getShopName() {
        return shopName;
    }

}
