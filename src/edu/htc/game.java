package edu.htc;

import java.util.ArrayList;

/**
 * Created by karennilson on 4/17/16.
 */
public class Game {
    private String gameName;
    private int releaseDate;
    private String platform;
    private ArrayList<String> tags;
    private int averageRating;
    private ArrayList<Review> reviews;


    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public void addTags(String tag){
        if (this.tags == null){
            this.tags = new ArrayList<>();
        }

        this.tags.add(tag);
    }

    public int getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(int averageRating) {
        this.averageRating = averageRating;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReviews(Review review){
        if (this.reviews==null){
            this.reviews= new ArrayList<>();
        }
        this.reviews.add(review);
    }
}
