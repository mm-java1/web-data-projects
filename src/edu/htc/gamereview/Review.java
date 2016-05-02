package edu.htc.gamereview;

import edu.htc.gamereview.ValidationMethod;


import java.util.ArrayList;
import java.util.Date;

/**
 * Created by cheey on 4/17/2016.
 */
public class Review {
    private int starRating;
    private Reviewer reviewer;
    private Game gameTitle;
    private String comments;

    private Date date;

    public Review() {
        this.starRating = -1;
    }


    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) throws InvalidDataTypeException{
        if (starRating < 0 || starRating > 6){
            throw new InvalidDataTypeException("Ratings should be 1-5.");}
            else {
            this.starRating = starRating;
            }

        }


    public Reviewer getReviewer() {
        return reviewer;
    }

    public void setReviewer(Reviewer reviewer) throws InvalidDataTypeException {
        if (reviewer == null){
            throw new InvalidDataTypeException("Reviewer must not be empty/null");
        }
        this.reviewer = reviewer;
    }

    public Game getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(Game gameTitle) throws InvalidDataTypeException{
        if (gameTitle == null){
            throw new InvalidDataTypeException("Game must not be empty/null");}

        else {
            this.gameTitle = gameTitle;
        }
    }

    public String getComments() {
        return comments;
    }

    public void setComments (String comments) throws InvalidDataTypeException  {
        if (comments == null) {
            throw new InvalidDataTypeException("Null comment");
        } else {
            this.comments = comments;
        }
    }

    public void addComments(String comments){
        this.comments = comments;
    }


    public Date setDate  (Date date) throws InvalidDataTypeException {
        if (date == null){
            throw new InvalidDataTypeException("Date cannot be null");
        }
        this.date = date;
        return date;

    }


    public Date getDate() {
        return date;
    }

    public boolean validate(){
        if (starRating != -1){
            return false;
        }
        if (reviewer == null) {
            return false;
        }
        if (gameTitle == null) {
            return false;
        }
        if (comments == null) {
            return false;
        }
        if (date == null) {
        return false;
        }

        return true;
    }

}
