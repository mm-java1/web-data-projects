package edu.htc.MoonflowerGameReview;

import java.util.Date;

/**
 * Created by clifford.mauer on 4/11/2016.
 */
public class Review {


    private Integer StarRating; //** 1 to 5, no half stars
    private String Reviewer;
    private String Game;
    private String Comments;  //** The text of the review
    private Date _Date;  //** use java.util.Date class

    public Integer getStarRating() {
        return StarRating;
    }

    public void setStarRating(int intstarRating) throws InvalidDataTypeException {

        //** check if the starrating is null or empty
        if (intstarRating == 0 || intstarRating > 5)
        {
            throw new InvalidDataTypeException("You must supply a star rating");
        }

        StarRating = intstarRating;
    }

    public String getReviewer() {
        return Reviewer;
    }

    public void setReviewer(String reviewer) throws InvalidDataTypeException {

        //**Check if name is null or empty
        if (reviewer == "" || reviewer == null){
            throw new InvalidDataTypeException("Name cannot be blank");
        }

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


}
