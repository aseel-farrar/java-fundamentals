package inheritance.lib.src.main;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ReviewTest {

    @Test
    void addReview() {

        //>>>>>>>> create restaurant
        Restaurant restaurant = new Restaurant("kebab wa koftah", 4, 50);

        // add some reviews
        restaurant.addReview("good food", "aseel", 2);

        assertEquals("aseel", restaurant.getReviews().get(0).getAuthor());

        //>>>>>>>>>>>>>> create shop
        Shop shop = new Shop("Lucky", "toys store", 50);
        assertEquals("Lucky", shop.shopName);

        //>>>>>>>>>>>>> create Theater
        Theater theater = new Theater("galaxy");

        // add some reviews
        theater.addReview("good toys", "aseel", 2);
        theater.addReview("good food", "ahmad", 5);
        theater.addReview("good food", "moh", 5);

        assertEquals(3,theater.getReviews().size());

    }

}