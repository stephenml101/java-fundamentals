package inheritance;

import java.util.ArrayList;

public class Restaurant {
    protected String name;
    protected int numStars;

    protected int numDollarSigns;

    ArrayList<Review> reviews;

    public Restaurant(String name, int numStars, int numDollarSigns) {
        this.name = name;
        this.numStars = numStars;
        this.numDollarSigns = numDollarSigns;
        this.reviews = new ArrayList<>();
    }
    // methods
    public String restaurantName() {
        return ("This restaurant is so amazing: " + this.name);
    }

//    public String addReview(Review review){
//
//    }
    // getters
    public String getName() {
        return name;
    }

    public int getNumStars() {
        return numStars;
    }

    public int getNumDollarSigns() {
        return numDollarSigns;
    }
    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setNumStars(int numStars) {
        this.numStars = numStars;
    }

    public void setNumDollarSigns(int numDollarSigns) {
        this.numDollarSigns = numDollarSigns;
    }

    //toString method
    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", numStars=" + numStars +
                ", numDollarSigns=" + numDollarSigns +
                '}';
    }
}
