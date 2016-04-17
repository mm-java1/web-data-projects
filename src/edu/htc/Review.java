package edu.htc;


import java.util.ArrayList;
import java.util.Date;
/**
 * Created by Joel on 4/15/2016.
 */
public class Review {

    private int starRate;
    private String reviewer;
    private String game;
    private String comment;
    private ArrayList<String> liComments = new ArrayList<String>();
    private Date date; //this will use java.util.Date class

    // construct
    public Review(int starRate, String reviewer, String game, String comment, Date date) {
        this.starRate = starRate;
        this.reviewer = reviewer;
        this.game = game;
        this.comment = comment;
        this.date = date;

    }
    //star rating
    public int getStarRating() {
        return starRate;
    }

    public void setStarRating(int starRating) {
        this.starRate = starRating;
    }

    //reviewer
    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }
    //game
    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    //comments
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    public ArrayList<String> getComments(){
        return this.liComments;
    }

    public void setComments(ArrayList<String> comments) {
        this.liComments = comments;
    }

    //date property
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}


