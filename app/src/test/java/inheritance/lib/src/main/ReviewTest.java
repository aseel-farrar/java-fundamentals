package inheritance.lib.src.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReviewTest {

    @Test
    void addReview() {

        // create restaurant
        Restaurant restaurant = new Restaurant("kebab wa koftah", 4, 50);

        // add some reviews
        restaurant.addReview("good food", "aseel", 2);

        assertEquals("aseel", restaurant.getReviews().get(0).getAuthor());

    }
}