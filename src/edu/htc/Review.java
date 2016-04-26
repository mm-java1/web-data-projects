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
    private Date date;

    public Review(){

    }
    public Review(int starRating, String comments){
        this.starRating = starRating;
        this.comments = comments;
    }


    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating)throws DataTypeInvalidException {
        if(starRating<0 || starRating>5){
            throw new DataTypeInvalidException("The rating should between 1 - 5!");
        } else{
            this.starRating = starRating;
        }

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = new Date();

    }
}
