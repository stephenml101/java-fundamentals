package inheritance;

public class Restaurant {
    protected String name;
    protected int numStars;

    protected int numDollarSigns;

    public Restaurant(String name, int numStars, int numDollarSigns) {
        this.name = name;
        this.numStars = numStars;
        this.numDollarSigns = numDollarSigns;
    }
    // methods
    public String restaurantName() {
        return ("This restaurant is so amazing: " + this.name);
    }
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
}
