package inheritance.lib.src.main;

public class Review {
    private String body;
    private String author;
    private int starsNumberFromAuthor;

    public Review() {

    }

    public Review(String body, String author, int starsNumberFromAuthor) {
        this.body = body;
        this.author = author;
        this.starsNumberFromAuthor = starsNumberFromAuthor;

    }

    @Override
    public String toString() {
        return author + "'s Review: \"" + body + "\"" + "\n" +
                ", Stars Number From " + author + ": " + starsNumberFromAuthor + "\n";
    }
}
