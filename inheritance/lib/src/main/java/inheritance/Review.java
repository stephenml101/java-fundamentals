package inheritance;

public class Review {
    protected String body;

    protected String author;

    protected int numStars;

    public Review(String body, String author, int numStars) {
        this.body = body;
        this.author = author;
        this.numStars = numStars;
    }
    // methods
    public String theReviews(){
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
}
