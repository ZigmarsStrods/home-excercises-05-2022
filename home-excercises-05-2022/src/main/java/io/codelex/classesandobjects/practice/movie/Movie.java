package io.codelex.classesandobjects.practice.movie;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        rating = "PG";
    }

    public String getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "\nMovie title='" + title + '\'' +
                ", studio='" + studio + '\'' +
                ", rating='" + rating + '\'';
    }
}
