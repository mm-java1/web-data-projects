package edu.htc;

import java.util.Date;

/**
 * Created by Owner on 4/18/2016.
 */
public class Review {

    //Properties
    private int starRating;
    private String reviewer;
    private String game;
    private String comments;
    private Date reviewDate = new Date();

    //Constructors
    public Review(int starRating, String reviewer, String game, String comments, Date reviewDate) {
        this.starRating = starRating;
        this.reviewer = reviewer;
        this.game = game;
        this.comments = comments;
        this.reviewDate = reviewDate;
    }


    //getter and setter
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

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }
}
