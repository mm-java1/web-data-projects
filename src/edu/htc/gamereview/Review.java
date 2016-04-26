package edu.htc.gamereview;

/**
 * Created by karennilson on 4/18/16.
 */
import java.util.Date;

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

    public void setStarRating(int starRating) throws InvalidDataTypeException{
        if (starRating < 0 || starRating > 5){
            throw new InvalidDataTypeException("Star rating must be between 0 and 5.");
        } else {
            this.starRating = starRating;
        }
    }

    public Reviewer getReviewer() {
        return reviewer;
    }

    public void setReviewer(Reviewer reviewer) throws InvalidDataTypeException {
        if (reviewer == null) {
            throw new InvalidDataTypeException("Reviewer cannot be null");
        } else {
            this.reviewer = reviewer;
        }
    }

    public Game getGame() {
        return game;
    }

    public void setGame (Game game) throws InvalidDataTypeException {
        if (game == null) {
            throw new InvalidDataTypeException("Game cannot be null");
        } else {
            this.game = game;
        }
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) throws InvalidDataTypeException {
        if (comments == null || comments.trim().isEmpty()) {
            throw new InvalidDataTypeException("Comments cannot be null or empty");
        } else {
            this.comments = comments;
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) throws InvalidDataTypeException {
        if (date == null) {
            throw new InvalidDataTypeException("Date cannot be null");
        } else {
            this.date = date;
        }
    }

    public boolean validate() {
        if (starRating == -1){
            return false;
        }
        if (reviewer == null || game == null || comments == null || date == null) {
            return false;
        }
        return true;
    }
}
