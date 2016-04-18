package edu.htc;

import java.util.ArrayList;

/**
 * Created by Owner on 4/18/2016.
 */
public class Game {

    //Game properties
    private String gameName;
    private int releaseDate;
    private String platform;
    private ArrayList<String> tags = new ArrayList<String>();
    private double rating;
    private ArrayList<String> reviews = new ArrayList<String>();


    //Constructors
    public Game(String gameName, int releaseDate, String platform, double rating, ArrayList<String> tags, ArrayList<String> reviews) {
        this.gameName = gameName;
        this.releaseDate = releaseDate;
        this.platform = platform;
        this.rating = rating;
        this.tags = tags;
        this.reviews = reviews;
    }

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

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<String> reviews) {
        this.reviews = reviews;
    }
}
