package io.codelex.classesandobjects.practice.exercise11;

public class Video {

    private String title = "";
    private boolean checkedOut = false;
    private double averageUserRating = 0;
    private int ratingTimes = 0;

    private int likedTimes = 0;

    public Video(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getRatingTimes() {
        return ratingTimes;
    }

    public int getLikedTimes() {
        return likedTimes;
    }

    public boolean isRentedOut() {
        return checkedOut;
    }

    public void checkout() {
        checkedOut = true;
    }

    public void returnVideo() {
        checkedOut = false;
    }

    public void giveRating(double rating) {
        int newRatingTimes = ratingTimes + 1;
        averageUserRating = ((averageUserRating * ratingTimes) + rating) / newRatingTimes;
        ratingTimes = newRatingTimes;
        if (rating > 5) {
            likedTimes++;
        }
    }

    @Override
    public String toString() {
        return "title= '" + title + '\'' +
                "\t averageUserRating= " + averageUserRating +
                "\t rentedOut= " + checkedOut;
    }
}
