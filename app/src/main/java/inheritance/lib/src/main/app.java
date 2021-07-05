package inheritance.lib.src.main;

public class app {
    public static void main(String[] args) {

        // create restaurant
        Restaurant restaurant1 = new Restaurant("kebab wa koftah", 4, 50);

        // invoke toString() before any reviews added
        System.out.println(restaurant1.toString());

        // add some reviews
        restaurant1.addReview("good food", "aseel", 2);
        restaurant1.addReview("good food", "ahmad", 5);
        restaurant1.addReview("good food", "moh", 5);

        // invoke toString() after reviews added
        System.out.println(restaurant1.toString());


        System.out.println();
        System.out.println();

        // create shop
        Shop shop = new Shop("Lucky", "toys store", 50);

        // invoke toString() before any reviews added
        System.out.println(shop.toString());

        // add some reviews
        shop.addReview("good toys", "aseel", 2);
        shop.addReview("good food", "ahmad", 5);
        shop.addReview("good food", "moh", 5);

        // invoke toString() after reviews added
        System.out.println(shop.toString());

        System.out.println();
        System.out.println();

//        // create Theater
        Theater theater = new Theater("galaxy");

        // invoke toString() before any reviews added or movies
        System.out.println(theater.toString());

        // add movies
        theater.addMovie("bad boys");
        theater.addMovie("batman vs Superman");
        theater.addMovie("The Fast");
        theater.addMovie("transporter");
        theater.addMovie("On the moon");

        // add some reviews
        theater.addReview("good toys", "aseel", 2);
        theater.addReview("good food", "ahmad", 5);
        theater.addReview("good food", "moh", 5);
        theater.addReview("good food", "nadeen", 5, "batman vs Superman");

        // invoke toString() after reviews added and movies
        System.out.println(theater.toString());

        //remove movies
        theater.removeMovie("On the moon");
        theater.removeMovie("The Fast");

        // invoke toString() after remove movies
        System.out.println(theater.toString());

    }
}
