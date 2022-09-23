package io.codelex.classesandobjects.practice.exercise11;

import java.util.LinkedList;
import java.util.List;

public class VideoStore {

    private List<Video> inventory = new LinkedList<>();

    public void addToInventory(String title) {
        Video newVideo = new Video(title);
        inventory.add(newVideo);
    }

    public void checkoutVideo(String title) {
        inventory.get(lookupIndex(title)).checkout();
    }

    public void returnVideo(String title) {
        inventory.get(lookupIndex(title)).returnVideo();
    }

    public void enterRating(String title, double rating) {
        inventory.get(lookupIndex(title)).giveRating(rating);


    }

    public void listInventory() {
        System.out.println("Store has following videos:");
        for (int i = 0; i < inventory.size(); i++) {
            System.out.print(i + "\t");
            System.out.println(inventory.get(i).toString());
        }
    }

    public void isRented(String title) {
        if (inventory.get(lookupIndex(title)).isRentedOut()) {
            System.out.println("Video is rented out!");
        } else {
            System.out.println("Video is available!");
        }

        System.out.println("Could not find the video!");
    }

    public void displayPercentageUsersLiked(String title) {

        Video currentVideo = inventory.get(lookupIndex(title));
        if (currentVideo.getRatingTimes() > 0) {
            System.out.println("The percentage of users that liked this video is " + (100 * currentVideo.getLikedTimes()) / currentVideo.getRatingTimes());
        } else {
            System.out.println("Video is not yet rated!");
        }
    }

    private int lookupIndex(String title) {
        for (Video lookupVideo : inventory) {
            if (lookupVideo.getTitle().equals(title)) {
                return inventory.indexOf(lookupVideo);
            }
        }
        return -1;
    }
}
