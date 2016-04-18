package edu.htc.GameApp;

import java.util.Date;

/**
 * Created by clifford.mauer on 4/11/2016.
 */
public class Review {


    private Integer StarRating; //** 1 to 5, no half stars
    private String Reviewer;
    private String Game;

    public Integer getStarRating() {
        return StarRating;
    }

    public void setStarRating(Integer starRating) {
        StarRating = starRating;
    }

    public String getReviewer() {
        return Reviewer;
    }

    public void setReviewer(String reviewer) {
        Reviewer = reviewer;
    }

    public String getGame() {
        return Game;
    }

    public void setGame(String game) {
        Game = game;
    }

    public String getComments() {
        return Comments;
    }

    public void setComments(String comments) {
        Comments = comments;
    }

    public Date get_Date() {
        return _Date;
    }

    public void set_Date(Date _Date) {
        this._Date = _Date;
    }

    private String Comments;  //** The text of the review
    private Date _Date;  //** use java.util.Date class

}
