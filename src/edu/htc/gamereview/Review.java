package edu.htc.gamereview;

import java.util.Date;

/**
 * Created by volkg_000 on 4/5/2016.
 */
public class Review {
    private int starRating;
    private Reviewer reviewer;
    private Game game;
    private String comments;
    private Date date; //this will use java.util.Date class

    boolean validstarRating = false;
    boolean validreviewer = false;
    boolean validGame = false;
    boolean validComments = false;
    boolean validDate = false;






    public Review() {
        this.starRating = -1;

    }

    public Review(int starRating, Reviewer reviewer, Game game, String comments, Date date) {
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

    public void setStarRating(int starRating) throws InvalidDataException {
        if(this.starRating < 0 || this.starRating > 5) {
           throw new InvalidDataException("Star rating must be between 0 and 5");

        }
        else {
            this.starRating = starRating;
        }

    }

    //reviewer property
    public Reviewer getReviewer() {
        return reviewer;
    }

    public void setReviewer(Reviewer reviewer) throws InvalidDataException {
        if (this.reviewer == null) {
            throw new InvalidDataException("Reviewer cannot be null");

        }
        else {
            this.reviewer = reviewer;
        }
    }
    //game property
    public Game getGame() {
        return game;
    }

    public void setGame(Game game) throws InvalidDataException {
        if (game == null) {
            throw new InvalidDataException("Game cannot be null");


        }

        else {
            this.game = game;
        }
    }

    //comments property
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) throws InvalidDataException {
       if(comments == null || comments.trim().isEmpty()) {
           throw new InvalidDataException("Comments cannot be null or empty");
       }
        else {
           this.comments = comments;
       }
    }

    //date property
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) throws InvalidDataException {
        if (date != null) {
            this.date = date;
        }

        else {
            throw new InvalidDataException("A review must contain a date");
        }
    }

    public boolean validate() {
        if(starRating == -1 ) {
            return false;
        }
        if(reviewer == null) {
            return false;
        }

        if(game == null) {
            return false;
        }

        if(comments == null) {
            return false;
        }

        if(date == null) {
            return false;
        }

        return true;


    }


}
