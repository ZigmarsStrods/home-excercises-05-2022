package io.codelex.classesandobjects.practice.exercise4;

import java.util.LinkedList;
import java.util.List;

public class MovieApp {
    public static void main(String[] args) {

        List<Movie> myMovies = new LinkedList<>();

        myMovies.add(new Movie("Casino Royale", "Eon Productions", "PG13"));
        myMovies.add(new Movie("Glass", "Buena Vista International", "PG"));
        myMovies.add(new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures", "PG"));
        List<Movie> pgMovies = getPG(myMovies);
        System.out.println(myMovies.toString());
    }


    public static List<Movie> getPG(List<Movie> movies) {
        List<Movie> filteredMovies = new LinkedList<>();
        for (Movie currentMovie : movies) {
            if (currentMovie.getRating().equals("PG")) {
                filteredMovies.add(currentMovie);
            }
        }
        return filteredMovies;
    }
}
