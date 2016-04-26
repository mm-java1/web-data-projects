package edu.htc;

import java.util.ArrayList;

/**
 * Created by Gyan on 4/18/2016.
 */
public class Game {
    private String gameName;
    private int releaseYear;
    private String platform;
    private String tag;
    private int avgRating;
    private ArrayList<Review> listReviews;
    private ArrayList<String> listTags;

    public Game(){

    }
    public Game(String gameName){
        this.gameName= gameName;

    }



    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
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

    public int getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(int avgRating) {
        this.avgRating = avgRating;
    }

    public ArrayList<Review> getListReview() {
        return listReviews;
    }

    protected void setListReview(ArrayList<Review> listReviews) {
        this.listReviews = listReviews;
    }

    public ArrayList<String> getListTags() {
        return listTags;
    }

    public void setListTags(ArrayList<String> listTags) {
        this.listTags = listTags;
    }

    public void addTag(String tag){
        listTags.add(tag);
    }

    public void addReview(Review review){
        if(this.listReviews == null){
            this.listReviews = new ArrayList<Review>();
        }
        this.listReviews.add(review);
    }


}
