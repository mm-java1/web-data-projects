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
    private ArrayList<Reviewer> liReviewers = new ArrayList<Reviewer>();
    private Date date; //this will use java.util.Date class

    // construct
    public Review(int starRate, String reviewer, String game, String comment, Date date) {
        this.starRate = starRate;
        this.reviewer = reviewer;
        this.game = game;
        this.comment = comment;
        this.date = date;

    }

    public Review() {

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

    protected ArrayList<Reviewer> getLiReviewers() {
        return liReviewers;
    }

    protected void setLiReviewers(ArrayList<Reviewer> liReviewers) {
        this.liReviewers = liReviewers;
    }

    public void addReviewer(Reviewer aReviewer) {
        try {
            if (reviewer == null) {
                throw new InvalidDataException();

            }
        }
        catch(InvalidDataException ex) {
            System.out.println("exception caught no reviewer");
        }
        //this is where I would add a reviewer to a review but did not get this far


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


