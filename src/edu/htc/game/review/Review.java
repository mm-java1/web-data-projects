package edu.htc.game.review;


import java.util.Date;
/**
 * Created by Joel on 4/15/2016.
 */
public class Review {

    private int starRate;
    private Reviewer reviewer;
    private Game game;
    private String comment;
    private Date date; //this will use java.util.Date class

    // construct
 /*   public Review(int starRate, String reviewer, String game, String comment, Date date) {
        this.starRate = starRate;
        this.comment = comment;
        this.date = date;

    }*/

    public Review() {
        starRate = -1;
    }

    //star rating
    public int getStarRating() {
        return starRate;
    }

    public void setStarRating(int starRating) throws InvalidDataTypeException {
        if (starRating < 0 || starRating > 5) {
            throw new InvalidDataTypeException("Star Rating must be between 0 and 5");
        } else {
            this.starRate = starRating;
        }
    }

    //reviewer
    public Reviewer getReviewer() {
        return reviewer;
    }

    public void setReviewer(Reviewer reviewer) throws InvalidDataTypeException {
        if (reviewer == null) {
            throw new InvalidDataTypeException("There must be a reviewer!");
        } else {
            this.reviewer = reviewer;
        }

    }


    //game
    public Game getGame() {
        return game;
    }

    public void setGame(Game game) throws InvalidDataTypeException {
        if (game == null){
            throw new InvalidDataTypeException("game cannot be null");
        } else {
            this.game = game;
        }
    }

    //comments
    public String getComments() {
        return comment;
    }

    public void setComments(String comment) throws InvalidDataTypeException {
        if (comment == null) {
            throw new InvalidDataTypeException("comments cannot be null");
        }
        this.comment = comment;
    }

    //date property
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) throws InvalidDataTypeException {
        if (date == null) {
            throw new InvalidDataTypeException("date cannot be null");
        }
        this.date = date;
    }
    public boolean validate() {
        if (starRate == -1) {
            return false;
        }
        if (reviewer == null) {
            return false;
        }
        if (game == null) {
            return false;
        }
        if (comment == null) {
            return false;
        }
        if (date == null) {
            return false;
        }
        return true;
    }

}


