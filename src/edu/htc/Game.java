package edu.htc;

import java.util.ArrayList;

/**
 * Created by volkg_000 on 4/5/2016.
 */
public class Game {
    private String name;
    private int releaseDate;
    private String platform;
    private String tag;
    private double avgRating;
    private ArrayList<Review> reviews = new ArrayList<Review>();
    private ArrayList<String> tags = new ArrayList<String>();


    public Game(String name, int releaseDate, String platform, String tag, double avgRating) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.platform = platform;
        this.tag = tag;
        this.avgRating = avgRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public double getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(double avgRating) {
        this.avgRating = avgRating;
    }


    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public void addTag(String tag) {
        tags.add(tag);
    }

    public void addReview(Review review) {
        reviews.add(review);
    }



    }
