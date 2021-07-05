package inheritance.lib.src.main;

public class app {
    public static void main(String[] args) {

        // create restaurant
        Restaurant restaurant1 = new Restaurant("kebab wa koftah",4,50);

        // invoke toString() before any reviews added
        System.out.println(restaurant1.toString());

        System.out.println();

        // print the restaurant1 stars number before the first review
        System.out.println(restaurant1.getRestaurantName()+" Stars Number: "+restaurant1.getStarsNumber());

        System.out.println();

        // add 1st review & print the restaurant1 stars number
        restaurant1.addReview("GOOD FOOD & GOOD PRICE ^_^","Aseel", 4);
        System.out.println(restaurant1.getRestaurantName()+" Stars Number: "+restaurant1.getStarsNumber());

        System.out.println();

        // add 2nd review & print the restaurant1 stars number
        restaurant1.addReview("not good at all","bulbul", 1);
        System.out.println(restaurant1.getRestaurantName()+" Stars Number: "+restaurant1.getStarsNumber());

        System.out.println();

        // add 3rd review & print the restaurant1 stars number
        restaurant1.addReview("best food ever","hamada", 5);
        System.out.println(restaurant1.getRestaurantName()+" Stars Number: "+restaurant1.getStarsNumber());
        System.out.println();

        // add 4th review & print the restaurant1 stars number which is grater than 5
        restaurant1.addReview("best food ever","hamada", 7);
        System.out.println(restaurant1.getRestaurantName()+" Stars Number: "+restaurant1.getStarsNumber());
        System.out.println();

        // add 5th review & print the restaurant1 stars number which is less than 5
        restaurant1.addReview("best food ever","hamada", -2);
        System.out.println(restaurant1.getRestaurantName()+" Stars Number: "+restaurant1.getStarsNumber());

        System.out.println();

        // invoke toString() after reviews added
        System.out.println(restaurant1.toString());

    }
}
