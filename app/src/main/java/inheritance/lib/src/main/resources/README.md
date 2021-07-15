# Lab: 07 - Inheritance, day 2
> To solve this lab we create `Shop` and `Theater` to simulate the shops and the theaters, also the Review class have been modified.
```java
/**
 * Theater class
 */
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

```

```java
/**
 * Shop class
 */
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
```

```java
/**
 * Review class
 */
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
```