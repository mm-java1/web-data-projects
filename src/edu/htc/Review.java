package edu.htc;

import java.util.Date;

/**
 * Created by Gyan on 4/18/2016.
 */
public class Review {
    private int starRating;
    private String reviewer;
    private String game;
    private String comments;
    private int date;

    public Review(int starRating, String reviewer, String game, String comments, int date){
        this.starRating = starRating;
        this.reviewer = reviewer;
        this.game = game;
        this.comments = comments;
        this.date = date;

    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
