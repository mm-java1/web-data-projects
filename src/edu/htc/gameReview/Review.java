package edu.htc.gameReview;

import java.util.Date;

/**
 * Created by Gyan on 4/18/2016.
 */
public class Review {
    private int starRating;
    private Reviewer reviewer;
    private Game game;
    private String comments;
    private Date date;

    public Review(){
        this.starRating = -1;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating)throws DataTypeInvalidException {
        if(starRating<0 || starRating>5){
            throw new DataTypeInvalidException("The rating should be between 1 and 5!");
        } else{
            this.starRating = starRating;
        }

    }

    public Reviewer getReviewer() {
        return reviewer;
    }

    public void setReviewer(Reviewer reviewer) throws DataTypeInvalidException {
        if(reviewer ==null){
            throw new DataTypeInvalidException("Reviewer can not be null");
        }else {
            this.reviewer = reviewer;
        }
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) throws DataTypeInvalidException {
        if(game == null){
            throw new DataTypeInvalidException("Game cannot be null.");
        }else{
            this.game = game;
        }

    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) throws DataTypeInvalidException{
        if(comments == null || comments.trim().isEmpty()){
            throw new DataTypeInvalidException("Comments cannot be null or blank ");
        }else {
            this.comments = comments;
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) throws DataTypeInvalidException {
        if(date == null){
            throw new DataTypeInvalidException("Date cannot be null");

        }
        this.date = date;
    }

    public boolean validate(){
        if(starRating == -1){
            return false;
        }
        if(reviewer == null){
            return false;
        }
        if(reviewer == null ||game ==null ||comments ==null || date == null){
            return false;
        }
        return true;

    }
}
