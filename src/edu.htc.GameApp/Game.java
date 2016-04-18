package edu.htc.GameApp;

import java.awt.*;

/**
 * Created by clifford.mauer on 4/11/2016.
 */
public class Game {

    private String Name;
    private Integer ReleaseDate;
    private String Platform;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(Integer releaseDate) {
        ReleaseDate = releaseDate;
    }

    public String getPlatform() {
        return Platform;
    }

    public void setPlatform(String platform) {
        Platform = platform;
    }

    public List getGameTags() {
        return GameTags;
    }

    public void setGameTags(List gameTags) {
        GameTags = gameTags;
    }

    public double getAverageRating() {
        return AverageRating;
    }

    public void setAverageRating(double averageRating) {
        AverageRating = averageRating;
    }

    public List getReviews() {
        return Reviews;
    }

    public void setReviews(List reviews) {
        Reviews = reviews;
    }

    private List GameTags; //** (words like genres/types, single/multiplay, awards, subscriptions)

    private double AverageRating;
    private List Reviews;

}
