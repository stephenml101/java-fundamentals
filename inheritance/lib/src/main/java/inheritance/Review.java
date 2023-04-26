package inheritance;

import java.util.ArrayList;

public class Review {
    protected String body;

    protected String author;

    protected int numStars;

    private Restaurant restaurant;

    public Review(String body, String author, int numStars) {
        this.body = body;
        this.author = author;
        this.numStars = numStars;
        this.restaurant = new Restaurant("Subway", 4, 3);
    }

    // methods
    public String theReviews() {
        return ("The reviews are: Author: " + this.author + " Stars: " + this.numStars + " Body: " + this.body);
    }
    // getters

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumStars() {
        return numStars;
    }

    // setters

    public void setBody(String body) {
        this.body = body;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumStars(int numStars) {
        this.numStars = numStars;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", numStars=" + numStars +
                '}';
    }

    public Restaurant getRestaurant() {
        return this.restaurant;
    }

}
