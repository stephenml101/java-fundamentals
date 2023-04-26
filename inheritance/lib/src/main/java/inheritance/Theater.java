package inheritance;

import java.util.ArrayList;

public class Theater {
    protected String name;
    protected ArrayList<String> allMovies;

    public Theater(String name, String allMovies) {
        this.name = name;
        this.allMovies = new ArrayList<>();
    }

    public void addMovie(String movie){
        allMovies.add(movie);
    }

    public void removeMovie(String movie) {
        allMovies.remove(movie);
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", allMovies=" + allMovies +
                '}';
    }
}
