package basics;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(2);

        while (true) {
            clock();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                clock();
            }
        }

    }

    // pluralize function
    public static String pluralize(String animalName, int animalCount) {
        if (animalCount == 1) {
            return animalName;
        } else {
            return animalName + "s";
        }
    }

    //flipNHeads function
    public static void flipNHeads(int numOfHeads) {
        Random rand = new Random();
        int flips = 0;
        int headCounter = 0;

        while (headCounter != numOfHeads) {
            float randNum = rand.nextFloat();
            flips++;
            if (randNum >= .5) {
                System.out.println("heads");
                headCounter++;
                if (headCounter == numOfHeads) {
                    break;
                }
            } else {
                System.out.println("tails");
                headCounter = 0;
            }
        }

        System.out.println("It took " + flips + " flips to flip " + numOfHeads + " head in a row.");
    }

    // clock function
    public static void clock() {
        LocalDateTime now = LocalDateTime.now();
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(time);
    }
}
