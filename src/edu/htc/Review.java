package edu.htc;

import java.util.Date;

/**
 * Created by volkg_000 on 4/5/2016.
 */
public class Review {
    private int starRating;
    private String reviewer;
    private String game;
    private String comments;
    private Date date; //this will use java.util.Date class

    public Review(int starRating, String reviewer, String game, String comments, Date date) {
        this.starRating = starRating;
        this.reviewer = reviewer;
        this.game = game;
        this.comments = comments;
        this.date = date;

    }
    //star rating property
    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    //reviewer property
    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }
    //game property
    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    //comments property
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    //date property
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
